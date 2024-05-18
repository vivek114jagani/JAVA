package Advance;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.MultiResolutionImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ImageAPI {
    public static void main(String[] args) {
        List<String> imgURLs = List.of("https://www.google.com/imgres?q=images&imgurl=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2015%2F04%2F23%2F22%2F00%2Ftree-736885_1280.jpg&imgrefurl=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fsea%2F&docid=QG4MQQA3E95exM&tbnid=aVgXecnmQ_f1MM&vet=12ahUKEwiKjbmUi5SGAxVijVYBHT1dAiQQM3oECBgQAA..i&w=1280&h=797&hcb=2&ved=2ahUKEwiKjbmUi5SGAxVijVYBHT1dAiQQM3oECBgQAA",
                "https://www.google.com/imgres?q=images&imgurl=https%3A%2F%2Fletsenhance.io%2Fstatic%2F8f5e523ee6b2479e26ecc91b9c25261e%2F1015f%2FMainAfter.jpg&imgrefurl=https%3A%2F%2Fletsenhance.io%2F&docid=-t22bY2ix3gHaM&tbnid=tYmxDgFq4MrkJM&vet=12ahUKEwiKjbmUi5SGAxVijVYBHT1dAiQQM3oECGIQAA..i&w=1280&h=720&hcb=2&ved=2ahUKEwiKjbmUi5SGAxVijVYBHT1dAiQQM3oECGIQAA",
                "https://www.google.com/imgres?q=images&imgurl=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F674010%2Fpexels-photo-674010.jpeg%3Fauto%3Dcompress%26cs%3Dtinysrgb%26dpr%3D1%26w%3D500&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fbeautiful%2F&docid=B51x0PBR9KNzvM&tbnid=5JNNVwIBcinY7M&vet=12ahUKEwiKjbmUi5SGAxVijVYBHT1dAiQQM3oECBkQAA..i&w=500&h=667&hcb=2&ved=2ahUKEwiKjbmUi5SGAxVijVYBHT1dAiQQM3oECBkQAA");

        // create a list of Image object
        List<Image> images = new ArrayList<>();

        // Create image objects using image urls
        for(String url : imgURLs) {
            try {
                images.add(ImageIO.read(new URL(url)));
            } catch (IOException e) {
                System.err.println("Error reading image from URL: " + url);
                e.printStackTrace();
            }
        }

        // Check if any images were successfully read
        if (images.isEmpty()) {
            System.out.println("No images were loaded.");
            return;
        }

        // read all images into one multiresolution image
        MultiResolutionImage multiResolutionImage = new BaseMultiResolutionImage(images.toArray(new Image[0]));

        // get all variants of images
        List<Image> variants = multiResolutionImage.getResolutionVariants();

        System.out.println("Total Number of images: " + variants.size());

        // print all the images
        for (Image img : variants) {
            System.out.println(img);
        }
    }
}
