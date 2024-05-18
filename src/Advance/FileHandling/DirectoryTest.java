package Advance.FileHandling;

import java.io.File;

public class DirectoryTest {

    public static void main(String[] args) {
        String dirname = "E:/IDE project/JAVA/src/Advance/FileHandling/new directory";
        File directory = new File(dirname);


        // Create directory.
        directory.mkdir();

        // Create new file object.
        File file = new File("E:/IDE project/JAVA/src/Advance/FileHandling/new directory");

        System.out.println(file.exists());

        //==============================================================================================================
        // read Directory.
        File file1 = null;
        String[] paths;

        try {
            file1 = new File("E:/IDE project/JAVA");

            paths = file1.list();

            for (String path:
                 paths) {
                System.out.println(path);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

/**
        //==============================================================================================================
        // delete Directory.
        File file2 = new File("E:/IDE project/JAVA/src/Advance/FileHandling/new directory");
        if (file2.exists()) {
            boolean success = file2.delete();

            if (success) {
                System.out.println("The Directory has been successfully deleted.");
            } else {
                System.out.println("The Directory deletion failed.");
            }
        } else {
            System.out.println("The Directory is not present.");
        }

        */
    }
}
