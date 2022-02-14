package directories;

import java.io.File;

/**
 * @author William
 */

// DIRECTORIES
public class CheckEmpty {
    private static void checkIfDirectoryIsEmpty(File directory) {
        if (directory.isDirectory()) {
            boolean isEmpty = (directory.list().length == 0);
            System.out.printf("%s directory %s empty \n", directory.getPath(), isEmpty ? "is" : "is not");
        } else {
            System.out.printf("%s is not a directory \n", directory.getPath());
        }
    }

    public static void main(String[] args) {
        checkIfDirectoryIsEmpty(new File("build"));
        checkIfDirectoryIsEmpty(new File("build.xml"));
    }
}