package directories;

import java.io.File;

/**
 * @author William
 */

// DIRECTORIES
public class CreateDirectories {
    public static void main(String[] args) {
        // Data
        String directories = "first-dir\\second-dir\\third-dir";
        File file = new File(directories);
        boolean wasCreated = file.mkdirs();

        // Output
        System.out.printf("%s directories %s created! \n", directories, wasCreated ? "was" : "was not");
    }
}