package Advance.Networking.URLClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnDemo {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.tutorialspoint.com/java/java_url_processing.htm");
//            URL url = new URL("https://www.chess.com/login_and_go?returnUrl=https://www.chess.com/home");
            URLConnection urlConnection = url.openConnection();

            HttpURLConnection connection;

            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("Pleas enter an HTTP URL.");
                return;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder urlString = new StringBuilder();
            String current;

            while ((current = in.readLine()) != null) {
                urlString.append(current);
            }

            System.out.println(urlString);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
