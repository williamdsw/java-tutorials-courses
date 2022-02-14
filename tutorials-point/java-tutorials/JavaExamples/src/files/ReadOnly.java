package files;

import java.io.File;

/**
 * @author William
 */

// FILES
public class ReadOnly {

    private static void checkFile(File file) {
        if (file.canWrite()) {
            System.out.println("This file is writable");
        } else {
            System.out.println("This file is read-only");
        }
    }

    public static void main(String[] args) {
        // Data
        File file = new File("files/input.txt");
        file.setReadOnly();

        // Output
        System.out.println(file.getName());
        checkFile(file);
        file.setWritable(true);
        checkFile(file);
    }
}