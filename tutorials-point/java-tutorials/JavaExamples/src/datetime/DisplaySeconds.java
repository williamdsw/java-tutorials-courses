package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author William
 */

// DATE TIME
public class DisplaySeconds {
    public static void main(String[] args) {
        // Params
        Date date = new Date();
        String secondFormat = "ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(secondFormat);

        // Output
        System.out.printf("Current second: %s \n", dateFormat.format(date));
    }
}