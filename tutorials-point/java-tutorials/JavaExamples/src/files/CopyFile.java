package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author William
 */

// FILES
public class CopyFile {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("files/source.txt");
            File destinationFile = new File("files/destination.txt");

            // Data
            try (FileInputStream inputStream = new FileInputStream(sourceFile)) {
                try (FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
                    byte[] buffer = new byte[1024];
                    int length = 0;
                    while ((length = inputStream.read(buffer)) > 0) {
                        outputStream.write(buffer, 0, length);
                    }
                }
            }

            // Output
            if (destinationFile.exists() && destinationFile.length() != 0) {
                System.out.println("File was copied successfully!");
            } else {
                System.out.println("File was not copied successfully!");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}