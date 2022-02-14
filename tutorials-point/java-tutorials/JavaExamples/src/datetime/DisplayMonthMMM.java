package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * @author William
 */

// DATE TIME
public class DisplayMonthMMM {
    private static void showFormatter() {
        // Data
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        String format = "%tB %tb %tm";
        formatter.format(format, calendar, calendar, calendar);

        // Output
        System.out.printf("Calendar: %s \n", calendar);
        System.out.printf("Calendar with Formatter: %s \n", formatter);
    }

    private static void showSimpleDateFormat() {
        // Params
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);

        // Formats
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMM");
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
        SimpleDateFormat markerFormat = new SimpleDateFormat("a");

        hour = (hour == 0 ? 12 : hour);

        // Output
        String currentDate = "Current Date is: %s %s %s %s";
        currentDate = String.format(currentDate, dayFormat.format(date), monthFormat.format(date), hour,
                markerFormat.format(date));
        System.out.println(currentDate);
    }

    public static void main(String[] args) {
        showFormatter();
        showSimpleDateFormat();
    }
}