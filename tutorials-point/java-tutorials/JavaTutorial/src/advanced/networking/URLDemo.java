package advanced.networking;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author William
 */

// URL PROCESSING
public class URLDemo {
    public static void main(String[] args) {
        try {
            String address = "https://github.com/williamdsw/java-courses";
            URL url = new URL(address);

            // Properties
            String protocol = url.getProtocol();
            String authority = url.getAuthority();
            String fileName = url.getFile();
            String host = url.getHost();
            String path = url.getPath();
            int port = url.getPort();
            int defaultPort = url.getDefaultPort();
            String query = url.getQuery();
            String ref = url.getRef();
            String userInfo = url.getUserInfo();
            String externalForm = url.toExternalForm();
            URI uri = url.toURI();

            // Output
            System.out.printf("URL: %s \n", url.toString());
            System.out.printf("Protocol: %s \n", protocol);
            System.out.printf("Authority: %s \n", authority);
            System.out.printf("File Name: %s \n", fileName);
            System.out.printf("Host: %s \n", host);
            System.out.printf("Path: %s \n", path);
            System.out.printf("Port: %s \n", port);
            System.out.printf("Default Port: %s \n", defaultPort);
            System.out.printf("Query: %s \n", query);
            System.out.printf("Ref: %s \n", ref);
            System.out.printf("User Info: %s \n", userInfo);
            System.out.printf("External Form: %s \n", externalForm);
            System.out.printf("URI: %s \n", uri);
        } catch (MalformedURLException | URISyntaxException exception) {
            exception.printStackTrace();
        }
    }
}