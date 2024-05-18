package Advance.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
        out.write("test data");
        out.close();

        File file  =new File("test.txt");
        if (file.exists()) {
            boolean success = file.delete();

            if (success) {
                System.out.println("The File has been successfully deleted.");
            } else {
                System.out.println("The File deleted failed.");
            }
        } else {
            System.out.println("The File is not present.");
        }
    }
}
