package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author William
 */

// FILES
public class CreateTempFile {
    public static void main(String[] args) {
        try {
            File directory = new File("files/");
            File tempFile = File.createTempFile("input_clone", ".tmp", directory);
            tempFile.deleteOnExit();
            boolean wasCreated = tempFile.exists();

            if (wasCreated) {
                FileWriter fileWriter = new FileWriter(tempFile);
                try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                    bufferedWriter.write("Test String");
                    System.out.println("Temp file created");
                }
            } else {
                System.out.println("Temp file was not created");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}