package Advance.Base64Encoding_Decoding;

import java.util.Base64;
import java.util.UUID;

public class Base64Tester {
    public static void main(String[] args) {
        String string = "Hello World!";

        // Simple Encoding and Decoding.

        // Encode String
        String base64EncodeString = Base64.getEncoder().encodeToString(string.getBytes());
        System.out.println("Encoding String:- " + base64EncodeString);

        // Decode String
        byte[] base64DecodeBytes = Base64.getDecoder().decode(base64EncodeString);
        String decodedString = new String(base64DecodeBytes);
        System.out.println("Decoded String:- " + decodedString);

        // URL Encoding and Decoding.

        // Encode URL
        String url = "https://www.tutorialspoint.com/java/java_base64.htm";

        String base64URLEncodede = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("Encoding URL:- " + base64URLEncodede);

        // Decode URL
        byte[] base64URLDecodedBytes = Base64.getUrlDecoder().decode(base64URLEncodede);
        String decodedURL = new String(base64URLDecodedBytes);
        System.out.println("Decoded URL:- " + decodedURL);

        // MIME (Multipurpose Internet Mail Extensions) Encoding and Decoding.

        // Encode MIME
        String mimeData = UUID.randomUUID().toString();

        String base64MIMEEncoded = Base64.getMimeEncoder().encodeToString(mimeData.getBytes());
        System.out.println("Encoding MIME:- " + base64MIMEEncoded);

        // Decode MIME
        byte[] base64DecodedMIME = Base64.getMimeDecoder().decode(base64MIMEEncoded);
        String decodedMIME = new String(base64DecodedMIME);
        System.out.println("Decode MIME:- " + decodedMIME);
    }
}
