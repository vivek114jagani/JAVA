package Advance.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileTester {
    public static void main(String[] args) {
        try {
            File file = new File("E://IDE project//JAVA//testFile1.txt");

            // Create File.
            if (file.createNewFile()) {
                System.out.println("File is Created.");
            } else {
                System.out.println("File already exists.");
            }

            // Write Content.
            FileWriter writer = new FileWriter(file);
            writer.write("Test data");
            writer.close();

            // read Content.
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
            Files.write(Paths.get("E://IDE project//JAVA//testFile2.txt"),data.getBytes());
            List<String> lines = Arrays.asList("1st Time", "2nd Time");
            Files.write(Paths.get("test.txt"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            List<String> content = Files.readAllLines(Paths.get("E://IDE project//JAVA//testFile2.txt"));

            System.out.println(content);

            content = Files.readAllLines(Paths.get("test.txt"));

            System.out.println(content);

        } catch (Exception e) {
            System.out.print("Exception");
        }
    }
}
