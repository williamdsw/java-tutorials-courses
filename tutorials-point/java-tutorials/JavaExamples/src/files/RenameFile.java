package files;

import java.io.File;

/**
 * @author William
 */

// FILES
public class RenameFile {
    public static void main(String[] args) {
        // Data
        File oldFile = new File("files/input.txt");
        File newFile = new File("files/input_new.txt");
        boolean hasRenamed = oldFile.renameTo(newFile);

        // Output
        System.out.println(oldFile.getName());
        System.out.println(newFile.getName());
        System.out.printf("Has renamed ? %s \n", hasRenamed ? "yes" : "no");
    }
}