package Advance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatchDemo {
    public static void main(String[] args) throws IOException {
        // create TWO file.
        Path path1 = Files.createTempFile("file1", ".txt");
        Path path2 = Files.createTempFile("file2", ".txt");

        // write same content to both the files.
        Files.writeString(path1, "Hello World");
        Files.writeString(path2, "Hello World");

        // check files for Mismatch,
        // being same content, it should return -1.
//        long mismatch = Files.mismatch(Path.of("testFile1.txt"), Path.of("testFile2.txt"));
        long mismatch = Files.mismatch(path1, path2);

        // print the message based on mismatch result
        if (mismatch > 1L) {
            System.out.println("Mismatch occurred in file1 and file2 at : " + mismatch);
        } else {
            System.out.println("Files Matched.");
        }

        // delete the files.
        path1.toFile().deleteOnExit();
        path2.toFile().deleteOnExit();
    }
}
