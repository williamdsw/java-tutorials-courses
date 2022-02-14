package directories;

import java.io.File;

/**
 * @author William
 */

// DIRECTORIES
public class ShowHierarchy {
    private static void showDirectoryHierarchy(int indent, File file) {
        // Output
        for (int i = 0; i < indent; i++) {
            System.out.print('-');
        }
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File subFile : files) {
                showDirectoryHierarchy(indent + 4, subFile);
            }
        }
    }

    public static void main(String[] args) {
        File directory = new File("build");
        showDirectoryHierarchy(1, directory);
    }
}