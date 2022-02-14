package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author William
 */

// DATE TIME
public class DisplayMarker {
    public static void main(String[] args) {
        // Data
        Date date = new Date();
        String format = "HH:mm:ss a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        // Output
        System.out.printf("Date: %s \n", date);
        System.out.printf("Date with format: %s \n", dateFormat.format(date));
    }
}