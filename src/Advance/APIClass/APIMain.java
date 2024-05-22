package Advance.APIClass;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        APIMain apiMain = new APIMain();
        System.out.println("GET METHOD:- ");
        apiMain.GetMethod();
        System.out.println("------------------------------------------------------------------");
        System.out.println("POST METHOD:- ");
        apiMain.PostMethod();
        System.out.println("------------------------------------------------------------------");
        System.out.println("PUT METHOD:- ");
        apiMain.PutMethod();
        System.out.println("------------------------------------------------------------------");
        System.out.println("PATCH METHOD:- ");
        apiMain.PatchMethod();
        System.out.println("------------------------------------------------------------------");
        System.out.println("DELETE METHOD:- ");
        apiMain.DeleteMethod();
    }

    public void GetMethod() throws IOException, InterruptedException {
        var url = "https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9efee90e2261";

        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var client = HttpClient.newBuilder().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    public void PostMethod() throws IOException {
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
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");

        try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
            dos.writeBytes(body);
        }

        System.out.println(conn.getResponseCode());
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    /**
     * <h3>PUT Method</h3><p>
     * <h4>1) Complete Update:</h4> The PUT method is used to update a resource with a complete new version.
     * When you send a PUT request, you are typically replacing the entire resource at the target URL with the content provided in the request.
     * <p><h4>2) Idempotent:</h4>  PUT requests are idempotent, meaning that multiple identical PUT requests should produce the same result as a single request.
     * If you send the same PUT request multiple times, the state of the resource will be the same as after the first request.<p>
     * <h4>3) Requires Full Representation:</h4>  When using PUT, you need to send the full representation of the resource,
     * even if only a few fields have changed. For example, if a resource has fields A, B, and C, and you want to update only B, you still need to send A, B, and C in the PUT request.
     * */

    public void PutMethod() throws IOException {

        String body = """
                {
                   "name": "IPhone 14 PRO MAX",
                   "data": {
                      "color": "red",
                      "price": 500
                   }
                }
                """;

        URL url = new URL("https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9efee90e2261");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
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

    /**
     * <h3>PATCH Method</h3><p>
     * <h4>1) Partial Update:</h4> The PATCH method is used for partial updates. It allows you to send only the changes,
     * or the specific fields that need to be updated, rather than the entire resource.<p>
     * <h4>2) Not Necessarily Idempotent:</h4> PATCH requests are not necessarily idempotent. While applying the same patch multiple times may produce the same result,
     * it depends on the nature of the changes specified in the patch.<p>
     * <h4>3) Requires Patch Instructions:</h4> PATCH requests typically contain instructions on how to modify the resource.
     * This can involve sending only the fields that need to be updated and their new values. The server then applies these changes to the existing resource.
     * */

    public void PatchMethod() throws IOException, InterruptedException {

        String body = """
                {
                   "name": "Apple MacBook Pro 16 (Updated Name)"
                }
                """;

        String url = "https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9efee90e2261";

        var request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
                .method("PATCH", HttpRequest.BodyPublishers.ofString(body)).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    public void DeleteMethod() throws IOException, InterruptedException {
        String url = "https://api.restful-api.dev/objects/ff8081818f8fd5f2018f9ef279f02243";

        var request = HttpRequest.newBuilder().DELETE().uri(URI.create(url)).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
