package directories;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author William
 */

// DIRECTORIES
public class SearchDirectories {
    private static void searchSubDirectoriesInDirectory(String directoryPath) {
        File folder = new File(directoryPath);
        if (folder.isDirectory()) {
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.isDirectory();
                }
            };

            // Output
            File[] directories = folder.listFiles(filter);
            if (directories.length >= 1) {
                for (File dir : directories) {
                    System.out.println(dir.getAbsolutePath());
                }
            } else {
                System.out.printf("%s folder doesn't contains sub folders. \n", folder.getAbsolutePath());
            }
        } else {
            System.out.printf("%s folder doesn't exists! \n", directoryPath);
        }
    }

    public static void main(String[] args) {
        searchSubDirectoriesInDirectory("build/classes");
        searchSubDirectoriesInDirectory("files");
        searchSubDirectoriesInDirectory("inputs");
    }
}