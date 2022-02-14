package networking;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author William
 */
public class URLFileSize {
    public static void main(String[] args) {
        try {
            // Data
            String host = "https://www.tutorialspoint.com/java/java_url_processing.htm";
            URL url = new URL(host);
            URLConnection urlConnection = url.openConnection();
            double bytes = urlConnection.getContentLengthLong();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            double gigabytes = (megabytes / 1024);
            double terabytes = (gigabytes / 1024);
            double petabytes = (terabytes / 1024);
            double exabytes = (petabytes / 1024);
            double zettabytes = (exabytes / 1024);
            double yottabytes = (zettabytes / 1024);

            // Output
            System.out.println(host);
            System.out.println("File sizes:");
            System.out.printf("%.2f bytes \n", bytes);
            System.out.printf("%.2f kb \n", kilobytes);
            System.out.printf("%.5f mb \n", megabytes);
            System.out.printf("%.10f gb \n", gigabytes);
            System.out.printf("%.15f tb \n", terabytes);
            System.out.printf("%.20f pb \n", petabytes);
            System.out.printf("%.25f eb \n", exabytes);
            System.out.printf("%.30f zb \n", zettabytes);
            System.out.printf("%.35f yb \n", yottabytes);
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}