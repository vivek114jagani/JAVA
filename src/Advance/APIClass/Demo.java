package Advance.APIClass;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Demo demo = new Demo();
        System.out.println("GET");
        demo.Get();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("POST");
        demo.Post();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("PUT");
        demo.Put();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("PATCH");
        demo.Patch();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("DELETE");
        demo.Delete();

    }

    public void Get() throws IOException, InterruptedException {
        var url = "https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9f88f7ae2361";

        var request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
        HttpResponse response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    public void Post() throws IOException {

        String body = """
                {
                    "name": "Apple MacBook Pro 16",
                    "data": {
                        "year": 2019,
                        "price": 1849.99,
                        "CPU model": "Intel Core i9",
                        "Hard disk size": "1 TB"
                    }
                }
                """;

        URL url = new URL("https://api.restful-api.dev/objects");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json");

        try(DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
            dos.writeBytes(body);
        }

        System.out.println(conn.getResponseCode());

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void Put() throws IOException {
        String body = """
                {
                   "name": "yolo",
                   "data": {
                      "key1": "Some Index text",
                      "key2": 777
                   }
                }
                """;

        URL url = new URL("https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9f88f7ae2361");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("PUT");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json");

        try(DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
            dos.writeBytes(body);
        }

        System.out.println(conn.getResponseCode());

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void Patch() throws IOException, InterruptedException {
        String body = """
                {
                   "name": "Apple MacBook Pro 16 (Updated Name)"
                }
                """;

        String url = "https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9f88f7ae2361";

        var request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
                .method("PATCH", HttpRequest.BodyPublishers.ofString(body)).build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    public void Delete() throws IOException, InterruptedException {
        String url = "https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9f87bfa72358";

        var request = HttpRequest.newBuilder().uri(URI.create(url)).DELETE().build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
