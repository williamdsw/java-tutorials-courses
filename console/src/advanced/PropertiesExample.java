package advanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author William
 */
public class PropertiesExample {
    private static final String SERVER_NAME_KEY = "server_name";
    private static final String REQUEST_TIMEOUT_KEY = "request_timeout";
    private static final String PORT_KEY = "port";
    private static final String PASSWORD_KEY = "password";
    private static final String UDP_PORT_KEY = "udp_port";
    private static final String PROPERTIES_FILE_PATH = "config.properties";

    public static void main(String[] args) {
        write();
        read();
    }

    /**
     * Write properties keys and values to a file
     */
    public static void write() {
        try {
            // Propeties values
            Properties properties = new Properties();
            properties.setProperty(SERVER_NAME_KEY, "metal_gear_solid_snake");
            properties.setProperty(REQUEST_TIMEOUT_KEY, "5000");
            properties.setProperty(PORT_KEY, "8080");
            properties.setProperty(PASSWORD_KEY, "oriquouis_prisken");
            properties.setProperty(UDP_PORT_KEY, "6523");

            // File
            try (OutputStream output = new FileOutputStream(PROPERTIES_FILE_PATH)) {
                properties.store(output, null);
                System.out.println("Properties saved");
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    /**
     * Read properties values
     */
    public static void read() {
        try {
            // Load file
            try (InputStream input = new FileInputStream(PROPERTIES_FILE_PATH)) {
                Properties properties = new Properties();
                properties.load(input);

                // Values
                String serverName = properties.getProperty(SERVER_NAME_KEY);
                String port = properties.getProperty(PORT_KEY);
                String password = properties.getProperty(PASSWORD_KEY);
                String request_timeout = properties.getProperty(REQUEST_TIMEOUT_KEY);
                String udp_port = properties.getProperty(UDP_PORT_KEY);

                // Output
                System.out.println("SERVER NAME: " + serverName);
                System.out.println("PORT: " + port);
                System.out.println("PASSWORD: " + password);
                System.out.println("REQUEST TIMEOUT: " + request_timeout);
                System.out.println("UDP PORT: " + udp_port);
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}