package networking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author William
 */

// NETWORKING
public class ReadDownloadWebPage {
    public static void main(String[] args) {
        try {
            // Input data
            String host = "https://github.com/williamdsw/java-courses/commits/master";
            URL url = new URL(host);
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                // Output file
                String outputFilePath = "files/data.html";
                FileWriter fileWriter = new FileWriter(outputFilePath);
                try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                    // Data
                    String currentLine = "";
                    while ((currentLine = bufferedReader.readLine()) != null) {
                        System.out.println(currentLine);
                        bufferedWriter.write(currentLine);
                        bufferedWriter.newLine();
                    }
                }
            }
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}