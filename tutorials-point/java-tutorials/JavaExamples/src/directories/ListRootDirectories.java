package directories;

import java.io.File;

/**
 * @author William
 */

// DIRECTORIES
public class ListRootDirectories {
    public static void main(String[] args) {
        File[] roots = File.listRoots();

        // Output
        System.out.println("Root directories:");
        for (File directory : roots) {
            System.out.println(directory.toString());
        }
    }
}