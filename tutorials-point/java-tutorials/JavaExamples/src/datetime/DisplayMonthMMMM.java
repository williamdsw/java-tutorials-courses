package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author William
 */

// DATE TIME
public class DisplayMonthMMMM {
    public static void main(String[] args) {
        // Params
        Date date = new Date();
        String monthFormat = "MMMM";
        SimpleDateFormat dateFormat = new SimpleDateFormat(monthFormat);

        // Output
        System.out.printf("Current month: %s \n", dateFormat.format(date));
    }
}