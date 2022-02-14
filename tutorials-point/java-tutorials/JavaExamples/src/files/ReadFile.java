package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author William
 */

// FILES
public class ReadFile {
    public static void main(String[] args) {
        String filePath = "files/third_file.txt";

        // Output
        try (FileReader fileReader = new FileReader(filePath)) {
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String currentLine = "";
                while ((currentLine = bufferedReader.readLine()) != null) {
                    System.out.println(currentLine);
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}