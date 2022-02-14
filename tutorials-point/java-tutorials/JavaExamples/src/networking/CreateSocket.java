package networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author William
 */

// NETWORKING
public class CreateSocket {
    public static void main(String[] args) {
        try {
            // Data
            Socket socket = new Socket("www.google.com", 80);
            InetAddress socketAddress = socket.getInetAddress();
            int socketPort = socket.getPort();
            int localPort = socket.getLocalPort();
            InetAddress localAddress = socket.getLocalAddress();

            // Output
            System.out.printf("Socket Address: %s \n", socketAddress);
            System.out.printf("Socket Port: %s \n", socketPort);
            System.out.printf("Local Port: %s \n", localPort);
            System.out.printf("Local Address: %s \n", localAddress);
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}