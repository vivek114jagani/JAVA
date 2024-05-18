package Advance.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CreateFile {
    public static void main(String[] args) {
        try {
            byte[] bWrite = {65,66,67,68,69};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int x = 0; x < size; x++){
                System.out.print((char)is.read() + " ");
            }
            is.close();

        } catch (Exception e) {
            System.out.print("Exception" + e);
        }
    }
}
