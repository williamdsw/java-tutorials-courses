package directories;

import java.io.File;

/**
 * @author William
 */

// DIRECTORIES
public class DeleteDirectories {

    private static boolean deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            String[] subDirectories = directory.list();
            for (String subDir : subDirectories) {
                File subDirectory = new File(directory, subDir);
                boolean hasDeleted = deleteDirectory(subDirectory);

                if (!hasDeleted)
                    return false;
            }
        }

        System.out.printf("%s was deleted! \n", directory.getPath());
        return directory.delete();
    }

    public static void main(String[] args) {
        deleteDirectory(new File("first-dir"));
    }
}