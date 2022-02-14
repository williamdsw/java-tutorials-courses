package advanced.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

/**
 * @author William
 */

// NETWORKING - SOCKET SERVER
public class SocketServer extends Thread {
    private ServerSocket serverSocket;
    private final int TIMEOUT = 10000;

    public SocketServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(TIMEOUT);
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Properties
                try (Socket server = serverSocket.accept()) {
                    // Properties
                    int localPort = serverSocket.getLocalPort();
                    SocketAddress localSocketAddress = server.getLocalSocketAddress();
                    SocketAddress remoteSocketAddress = server.getRemoteSocketAddress();
                    DataInputStream dataInputStream = new DataInputStream(server.getInputStream());
                    DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());

                    // Output
                    System.out.printf("Waiting for client on port %d ... \n", localPort);
                    System.out.printf("Just connected to %s \n", remoteSocketAddress);
                    System.out.println(dataInputStream.readUTF());
                    dataOutputStream
                            .writeUTF(String.format("Thank you for connecting to %s \nGoodbye!", localSocketAddress));
                    break;
                } catch (SocketTimeoutException exception) {
                    System.out.println("Socket timed out");
                    System.out.println(exception.getMessage());
                    break;
                }
            } catch (IOException exception) {
                exception.printStackTrace();
                break;
            }
        }
    }
}