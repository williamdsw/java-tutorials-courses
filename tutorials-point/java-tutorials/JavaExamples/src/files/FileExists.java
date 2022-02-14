package files;

import java.io.File;

/**
 * @author William
 */

// FILES
public class FileExists {
    public static void main(String[] args) {
        // Data
        File file = new File("files/input1.txt");
        boolean fileExists = file.exists();

        // Output
        System.out.println(file.getName());
        System.out.printf("Does file exist? %s \n", fileExists ? "Yes" : "No");
    }
}