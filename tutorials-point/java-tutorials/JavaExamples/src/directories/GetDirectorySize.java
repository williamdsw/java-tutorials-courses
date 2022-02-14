package directories;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * @author William
 */

// DIRECTORIES
public class GetDirectorySize {
    private static void getFolderSize(String path) throws IOException {
        File folder = new File(path);

        if (folder.exists() && folder.isDirectory()) {
            double bytes = FileUtils.sizeOfDirectory(folder);
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            double gigabytes = (megabytes / 1024);
            double terabytes = (gigabytes / 1024);
            double petabytes = (terabytes / 1024);
            double exabytes = (petabytes / 1024);
            double zettabytes = (exabytes / 1024);
            double yottabytes = (zettabytes / 1024);

            // Output
            System.out.printf("%s folder sizes:\n", folder.getCanonicalPath());
            System.out.printf("%.2f bytes \n", bytes);
            System.out.printf("%.2f kb \n", kilobytes);
            System.out.printf("%.5f mb \n", megabytes);
            System.out.printf("%.10f gb \n", gigabytes);
            System.out.printf("%.15f tb \n", terabytes);
            System.out.printf("%.20f pb \n", petabytes);
            System.out.printf("%.25f eb \n", exabytes);
            System.out.printf("%.30f zb \n", zettabytes);
            System.out.printf("%.35f yb \n", yottabytes);
        } else {
            System.out.printf("%s folder doesn't exists!\n", path);
        }
    }

    public static void main(String[] args) {
        try {
            getFolderSize("files");
            getFolderSize("mydir");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}