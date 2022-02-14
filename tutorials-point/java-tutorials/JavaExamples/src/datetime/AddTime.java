package datetime;

import java.util.Calendar;
import java.util.Date;

/**
 * @author William
 */

// DATE TIME
public class AddTime {
    public static void main(String[] args) {
        // Params
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        // Output
        System.out.printf("Now: %s \n", calendar.getTime().toString());
        calendar.add(Calendar.MONTH, 1);
        System.out.printf("After 1 month: %s \n", calendar.getTime().toString());
        calendar.add(Calendar.HOUR, 5);
        System.out.printf("After 5 hours: %s \n", calendar.getTime().toString());
        calendar.add(Calendar.YEAR, 10);
        System.out.printf("After 10 years: %s \n", calendar.getTime().toString());
    }
}