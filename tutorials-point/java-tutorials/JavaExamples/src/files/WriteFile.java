package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author William
 */

// FILES
public class WriteFile {
    public static void main(String[] args) {
        // Data
        String filePath = "files/other_new_file.txt";
        String content = "See the cycle i've waiting for...";
        File file = new File(filePath);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter fileWriter = new FileWriter(filePath)) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                    bufferedWriter.write(content);
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}