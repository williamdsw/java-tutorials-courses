package advanced.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author William
 */
public class URLConnectionDemo {
    public static void main(String[] args) {
        try {
            String address = "https://www.tutorialspoint.com/java/java_url_processing.htm";
            URL url = new URL(address);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;

            // Checks
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("Please enter an HTTP URL");
                return;
            }

            // Properties
            Date date = new Date(urlConnection.getDate());
            Date expiration = new Date(urlConnection.getExpiration());
            Date lastModified = new Date(urlConnection.getLastModified());

            // Output
            System.out.printf("URL : %s \n", urlConnection.getURL());
            System.out.printf("Date : %s \n", date);
            System.out.printf("Expiration : %s \n", expiration);
            System.out.printf("Last Modified : %s \n", lastModified);

            // URL content (HTML)
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String current = "";

            System.out.println("Content:");
            while ((current = bufferedReader.readLine()) != null) {
                System.out.println(current);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}