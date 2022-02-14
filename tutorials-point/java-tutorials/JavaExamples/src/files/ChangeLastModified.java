package files;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author William
 */

// FILES
public class ChangeLastModified {
    public static void main(String[] args) {
        try {
            // Data
            File file = new File("files/new_file.txt");
            boolean hasCreated = file.createNewFile();

            if (hasCreated) {
                long timeCreated = file.lastModified();
                file.setLastModified(System.currentTimeMillis());
                long lastModified = file.lastModified();
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

                // Output
                System.out.printf("Time Created: %s \n", dateFormat.format(new Date(timeCreated)));
                System.out.printf("Last Modified: %s \n", dateFormat.format(new Date(lastModified)));
            } else {
                System.out.println("File was not created.");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}