package files;

import java.io.File;

/**
 * @author William
 */

// FILES
public class FileSizes {
    public static void main(String[] args) {
        File file = new File("files/output.txt");

        if (file.exists()) {
            double bytes = file.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            double gigabytes = (megabytes / 1024);
            double terabytes = (gigabytes / 1024);
            double petabytes = (terabytes / 1024);
            double exabytes = (petabytes / 1024);
            double zettabytes = (exabytes / 1024);
            double yottabytes = (zettabytes / 1024);

            // Output
            System.out.println(file.getName());
            System.out.println("File sizes:");
            System.out.printf("%.2f b \n", bytes);
            System.out.printf("%.2f kb \n", kilobytes);
            System.out.printf("%.5f mb \n", megabytes);
            System.out.printf("%.10f gb \n", gigabytes);
            System.out.printf("%.15f tb \n", terabytes);
            System.out.printf("%.20f pb \n", petabytes);
            System.out.printf("%.25f eb \n", exabytes);
            System.out.printf("%.30f zb \n", zettabytes);
            System.out.printf("%.35f yb \n", yottabytes);
        } else {
            System.out.println("File doesn't exists!");
        }
    }
}