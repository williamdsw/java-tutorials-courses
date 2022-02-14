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
public class DisplayShortMonths {

    private static void showShortMonths() {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        for (String month : shortMonths) {
            System.out.println(month);
        }
    }

    private static void showDateFormat() {
        // Params
        Date date = Calendar.getInstance().getTime();
        String format = "dd-MMM-yy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);

        // Output
        System.out.println(dateFormat.format(date));
    }

    public static void main(String[] args) {
        showShortMonths();
        showDateFormat();
    }
}