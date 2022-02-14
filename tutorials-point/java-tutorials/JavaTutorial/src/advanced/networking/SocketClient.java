package advanced.networking;

import java.io.*;
import java.net.*;

/**
 * @author William
 */

// NETWORKING - SOCKET CLIENT
public class SocketClient {
    public void connectToServer(String serverName, int port) {
        try (Socket client = new Socket(serverName, port)) {
            // Properties
            SocketAddress remoteSocketAddress = client.getRemoteSocketAddress();
            SocketAddress localSocketAddress = client.getLocalSocketAddress();
            OutputStream outputToServer = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputToServer);
            InputStream inputFromServer = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputFromServer);

            // Output
            System.out.printf("Connecting to %s on port %d \n", serverName, port);
            System.out.printf("Just connected to %s \n", remoteSocketAddress);
            dataOutputStream.writeUTF("Hello from " + localSocketAddress);
            System.out.printf("Server says: %s \n", dataInputStream.readUTF());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}