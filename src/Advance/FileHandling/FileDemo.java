package Advance.FileHandling;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = null;
        String[] strs = {"test1.txt","test2.txt"};
        try {
            for (String s:
                 strs) {
                // create a new file.
                f = new File(s);

                // if true the file is executable.
                boolean bool = f.canExecute();

                // find the absolute path.
                String a = f.getAbsolutePath();

                // print that path.
                System.out.println(a);

                // print
                System.out.println(" is executable :- " + bool);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
