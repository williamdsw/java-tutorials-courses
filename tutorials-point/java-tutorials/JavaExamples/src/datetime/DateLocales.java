package datetime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author William
 */

// DATE TIME
public class DateLocales {
    public static void main(String[] args) {
        // Params
        Date now = new Date();
        Locale italy = new Locale("it");
        Locale brazil = new Locale("pt", "br");
        DateFormat italyFormat = DateFormat.getDateInstance(DateFormat.FULL, italy);
        DateFormat brazilFormat = DateFormat.getDateInstance(DateFormat.FULL, brazil);

        // Output
        System.out.printf("Today: %s \n", now.toString());
        System.out.printf("Today in Italy: %s \n", italyFormat.format(now));
        System.out.printf("Today in Brazil: %s \n", brazilFormat.format(now));
    }
}