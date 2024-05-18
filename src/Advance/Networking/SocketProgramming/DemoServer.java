package Advance.Networking.SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class DemoServer extends Thread {

    private final ServerSocket serverSocket;

    public DemoServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while (true) {
            try {

                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();

                System.out.println("Just connected to " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());

                System.out.println(in.readUTF());

                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting to " +server.getLocalSocketAddress() + "\nGoodbye!");

                server.close();

            } catch (SocketTimeoutException e) {
                System.out.println("Socket Time out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {

        int port = Integer.parseInt(args[0]);

        try {
            Thread t = new DemoServer(port);
            t.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
