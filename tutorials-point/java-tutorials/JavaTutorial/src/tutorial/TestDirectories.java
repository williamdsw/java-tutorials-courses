package tutorial;

import java.io.File;

/**
 * @author William
 */
public class TestDirectories {
    public static void main(String[] args) {
        final String PATH = "/mk/trilogy/new-champion";
        createDirectory(PATH);
        listDirectories("/");
    }

    // Creates new directory based on path
    private static boolean createDirectory(String path) {
        return new File(path).mkdirs();
    }

    // List all directories based on path
    private static void listDirectories(String path) {
        try {
            File file = new File(path);
            String[] paths = file.list();

            for (String currentPath : paths) {
                System.out.println(currentPath);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}