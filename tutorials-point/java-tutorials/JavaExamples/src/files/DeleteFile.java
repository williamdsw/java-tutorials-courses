package files;

import java.io.File;

/**
 * @author William
 */

// FILES
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("files/input_new.txt");
        boolean wasDeleted = file.delete();

        // Output
        if (wasDeleted) {
            System.out.printf("File %s was deleted. \n", file.getName());
        } else {
            System.out.println("Unable to delete file.");
        }
    }
}