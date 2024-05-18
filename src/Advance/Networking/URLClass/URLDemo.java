package Advance.Networking.URLClass;

import java.io.IOException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tutorialspoint.com/java/java_url_processing.htm?language=en#j2es");

            System.out.println("URL is:- " + url);
            System.out.println("Protocol is:- " + url.getProtocol());
            System.out.println("Authority is:- " + url.getAuthority());
            System.out.println("File name is:- " + url.getFile());
            System.out.println("Host is:- " + url.getHost());
            System.out.println("Path is:- " + url.getPath());
            System.out.println("Port is:- " + url.getPort());
            System.out.println("Default port is:- " + url.getDefaultPort());
            System.out.println("Query is:- " + url.getQuery());
            System.out.println("Ref is:- " + url.getRef());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
