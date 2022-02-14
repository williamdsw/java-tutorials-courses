package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author William
 */

// NETWORKING
public class InetAddressInformations {
    public static void main(String[] args) {
        try {
            // Data
            InetAddress address = InetAddress.getLocalHost();
            String hostName = address.getHostName();
            String hostAddress = address.getHostAddress();
            String canonicalHostName = address.getCanonicalHostName();

            // Output
            System.out.printf("Host Name = %s \n", hostName);
            System.out.printf("Host Address = %s \n", hostAddress);
            System.out.printf("Canonical Host Name = %s \n", canonicalHostName);
        } catch (UnknownHostException exception) {
            System.out.println(exception);
        }
    }
}