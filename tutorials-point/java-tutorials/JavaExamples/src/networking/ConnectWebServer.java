package networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author William
 */

// NETWORKING
public class ConnectWebServer {
    public static void main(String[] args) {
        try {
            // Data
            String host = "www.google.com";
            int port = 80;
            try (Socket socket = new Socket(host, port)) {
                InetAddress address = socket.getInetAddress();
                String hostName = address.getHostName();
                String hostAddress = address.getHostAddress();
                String canonicalHostName = address.getCanonicalHostName();

                // Output
                System.out.printf("Connected to %s \n", address);
                System.out.printf("Host Name = %s \n", hostName);
                System.out.printf("Host Address = %s \n", hostAddress);
                System.out.printf("Canonical Host Name = %s \n", canonicalHostName);
            }
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}