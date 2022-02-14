package directories;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author William
 */

// DIRECTORIES
public class GetLastModified {
    public static void main(String[] args) {
        // Data
        File directory = new File("build");
        long lastModified = directory.lastModified();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

        // Output
        System.out.printf("Directory: %s \n", directory.getName());
        System.out.printf("Last Modified in ms: %s \n", lastModified);
        System.out.printf("Last Modified in date: %s \n", dateFormat.format(lastModified));
    }
}