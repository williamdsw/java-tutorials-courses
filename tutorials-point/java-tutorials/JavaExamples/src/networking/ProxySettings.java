package networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

/**
 * @author William
 */

// NETWORKING
public class ProxySettings {
    public static void main(String[] args) {
        try {
            // Settings
            Properties settings = System.getProperties();
            settings.put("java.net.useSystemProxies", "true");
            settings.put("proxySet", "true");
            settings.put("http.proxyHost", "proxy.retrogemn.local");
            settings.put("http.proxyPort", "80");

            // Connection
            String host = "http://www.google.com";
            URL url = new URL(host);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            int responseCode = urlConnection.getResponseCode();
            String responseMessage = urlConnection.getResponseMessage();

            // Proxy
            Proxy proxy = ProxySelector.getDefault().select(url.toURI()).iterator().next();
            String proxyType = proxy.type().name();
            InetSocketAddress address = (InetSocketAddress) proxy.address();
            String hostName = address.getHostName();
            int port = address.getPort();

            // Output
            System.out.println("----- HOST -----");
            System.out.println(host);
            System.out.printf("Response Code: %s \n", responseCode);
            System.out.printf("Response Message: %s \n", responseMessage);

            System.out.println("----- PROXY -----");
            System.out.printf("Proxy Type: %s \n", proxyType);
            System.out.printf("Host Name: %s \n", hostName);
            System.out.printf("Port: %s \n", port);
        } catch (IOException | URISyntaxException exception) {
            System.out.println(exception);
        }
    }
}