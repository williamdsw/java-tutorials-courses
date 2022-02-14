package files;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author William
 */

// FILES
public class LastModified {
    public static void main(String[] args) {
        // Data
        File file = new File("files/input.txt");
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");

        // Output
        System.out.println(file.getName());
        System.out.printf("Last modified: %s \n", dateFormat.format(date));
    }
}