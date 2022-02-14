package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author William
 */

// DATE TIME
public class Display24Hour {

    private static void showHour() {
        // Params
        Date date = new Date();
        String hourFormat = "h";
        SimpleDateFormat dateFormat = new SimpleDateFormat(hourFormat);

        // Output
        System.out.printf("Current hour: %s \n", dateFormat.format(date));
    }

    private static void showFullTime() {
        // Params
        Date date = new Date();
        String hourFormat = "kk:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(hourFormat);

        // Output
        System.out.printf("Current hour: %s \n", dateFormat.format(date));
    }

    public static void main(String[] args) {
        showHour();
        showFullTime();
    }
}