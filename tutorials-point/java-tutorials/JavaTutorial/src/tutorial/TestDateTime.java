package tutorial;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author William
 */
public class TestDateTime {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat shortDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat shortTime = new SimpleDateFormat("HH:mm:ss");
        String dateFormatted = String.format("%tc", now);

        // Output
        System.out.println(now);
        System.out.println(shortDate.format(now));
        System.out.println(shortTime.format(now));
        System.out.println(dateFormatted);
    }
}