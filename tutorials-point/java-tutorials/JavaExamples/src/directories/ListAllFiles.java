package directories;

import java.io.File;
import java.io.IOException;

/**
 * @author William
 */

// DIRECTORIES
public class ListAllFiles {
    private static void listAllFiles(String path) {
        try {
            File folder = new File(path);
            String absolutePath = folder.getAbsolutePath();
            if (folder.isDirectory()) {
                File[] files = folder.listFiles();
                if (files.length >= 1) {
                    System.out.printf("List of files of %s:\n", absolutePath);
                    for (File file : files) {
                        if (!file.isDirectory()) {
                            System.out.println(file.getCanonicalPath());
                        }
                    }
                } else {
                    System.out.printf("There is no file inside %s \n", absolutePath);
                }
            } else {
                System.out.printf("There is no folder at @%s \n", absolutePath);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        listAllFiles("files");
        listAllFiles("build.xml");
        listAllFiles("empty_folder");
    }
}