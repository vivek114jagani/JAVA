package Advance.FileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        try {
            byte[] bWrite = {70,71,72,73,74};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int x = 0; x < size; x++) {
                System.out.print((char)is.read() + " ");
            }
            is.close();

        } catch (Exception e) {
            System.out.print("Exception");
        }

        try {
            File file = new File("E://IDE project//JAVA//testFile1.txt");
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already available");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Test Data");
            writer.close();

            FileReader reader = new FileReader(file);
            
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.print(ch);
            }

        } catch (Exception e) {
            System.out.print("Exception");
        }

        try {
            String data = "Test Data";
            Files.write(Paths.get("E://IDE project//JAVA//testFile2.txt"), data.getBytes());
            List<String> lines = Arrays.asList("3rd line", "4thLine");

            Files.write(Paths.get("test.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            List<String> content = Files.readAllLines(Paths.get("E://IDE project//JAVA//testFile2.txt"));
            System.out.println(content);

            content = Files.readAllLines(Paths.get("test.txt"));
            System.out.println(content);

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
