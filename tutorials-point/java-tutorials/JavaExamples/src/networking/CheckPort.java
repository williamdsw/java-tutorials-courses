package networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author William
 */

// NETWORKING
public class CheckPort {
    public static void main(String[] args) {
        String host = "localhost";
        final int MAX_NUMBER_OF_PORTS = 1024;

        for (int port = 0; port < MAX_NUMBER_OF_PORTS; port++) {
            try {
                System.out.printf("Looking for port %d \n", port);
                Socket socket = new Socket(host, port);
                System.out.printf("There is a server on port %d of %s \n", port, host);
            } catch (UnknownHostException exception) {
                System.out.println(exception);
                break;
            } catch (IOException exception) {
                System.out.println(exception);
            }
        }
    }
}