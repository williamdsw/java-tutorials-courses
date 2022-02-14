package advanced.networking;

import java.io.IOException;

/**
 * @author William
 */

// NETWORKING - SOCKETS
public class CommunicationTest {

    private static final String SERVER_NAME = "localhost";
    private static final int PORT = 6066;

    public static void main(String[] args) {
        try {
            Thread server = new SocketServer(PORT);
            server.start();
            SocketClient client = new SocketClient();
            client.connectToServer(SERVER_NAME, PORT);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}