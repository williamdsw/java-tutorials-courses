package datetime;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author William
 */

// DATE TIME
public class DisplayCalendarConst {
    public static void main(String[] args) {
        // Data
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int hour = calendar.get(Calendar.HOUR);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int millisecond = calendar.get(Calendar.MILLISECOND);
        int minute = calendar.get(Calendar.MINUTE);
        int month = calendar.get(Calendar.MONTH);
        int second = calendar.get(Calendar.SECOND);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int year = calendar.get(Calendar.YEAR);

        // Output
        System.out.printf("Today: %s \n", calendar.getTime().toString());
        System.out.printf("Day of Month: %s \n", dayOfMonth);
        System.out.printf("Day of Week: %s \n", dayOfWeek);
        System.out.printf("Day of Week in Month: %s \n", dayOfWeekInMonth);
        System.out.printf("Day of Year: %s \n", dayOfYear);
        System.out.printf("Hour: %s \n", hour);
        System.out.printf("Hour of Day: %s \n", hourOfDay);
        System.out.printf("Millisecond: %s \n", millisecond);
        System.out.printf("Minute: %s \n", minute);
        System.out.printf("Month: %s \n", month);
        System.out.printf("Second: %s \n", second);
        System.out.printf("Week Of Month: %s \n", weekOfMonth);
        System.out.printf("Week Of Year: %s \n", weekOfYear);
        System.out.printf("Year: %s \n", year);
    }
}