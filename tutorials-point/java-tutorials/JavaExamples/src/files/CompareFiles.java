package files;

import java.io.File;

/**
 * @author William
 */

// FILES
public class CompareFiles {
    public static void main(String[] args) {
        // Data
        File firstFile = new File("files/input.txt");
        File secondFile = new File("files/output.txt");
        boolean theyAreEquals = (firstFile.compareTo(secondFile) == 0);

        // Output
        System.out.println(firstFile.getName());
        System.out.println(secondFile.getName());
        System.out.printf("Files %s equals! \n", theyAreEquals ? "are" : "aren't");
    }
}