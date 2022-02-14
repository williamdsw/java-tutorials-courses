package directories;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import org.apache.commons.io.filefilter.FileFileFilter;

/**
 * @author William
 */

// DIRECTORIES
public class SearchFiles {
    private static void searchFilesInDirectory(String directoryPath, String query) {
        File folder = new File(directoryPath);
        if (folder.isDirectory()) {
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File file, String name) {
                    return name.startsWith(query);
                }
            };

            // Output
            String[] files = folder.list(filter);
            if (files.length >= 1) {
                for (String fileName : files) {
                    System.out.println(fileName);
                }
            } else {
                System.out.printf("%s folder doesn't contains files. \n", folder.getAbsolutePath());
            }
        } else {
            System.out.printf("%s folder doesn't exists! \n", directoryPath);
        }
    }

    public static void main(String[] args) {
        searchFilesInDirectory("files", "o");
        searchFilesInDirectory("build", "o");
        searchFilesInDirectory("input", "o");
    }
}