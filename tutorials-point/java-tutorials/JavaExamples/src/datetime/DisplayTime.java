package datetime;

import java.util.Calendar;
import java.util.Formatter;

/**
 * @author William
 */

// DATE TIME
public class DisplayTime {
    private static void showFormatter() {
        // Params
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        String format = "%tl:%tM";
        formatter.format(format, calendar, calendar);

        // Output
        System.out.printf("Current time: %s \n", formatter);
    }

    private static void showCalendar() {
        // Params
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Output
        System.out.printf("Current time: %s:%s \n", hour, minute);
    }

    public static void main(String[] args) {
        showFormatter();
        showCalendar();
    }
}