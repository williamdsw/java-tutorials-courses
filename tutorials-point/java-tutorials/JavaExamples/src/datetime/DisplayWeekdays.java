package datetime;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author William
 */

// DATE TIME
public class DisplayWeekdays {
    private static void showWeekdays() {
        String[] weekdays = new DateFormatSymbols().getWeekdays();
        for (String day : weekdays) {
            System.out.println(day);
        }
    }

    private static void showDateFormat() {
        // Params
        Date date = new Date();
        String format = "EEE";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);

        // Output
        System.out.println(dateFormat.format(date));
    }

    public static void main(String[] args) {
        showWeekdays();
        showDateFormat();
    }
}