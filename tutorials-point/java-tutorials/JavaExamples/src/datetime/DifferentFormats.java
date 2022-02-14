package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author William
 */

// DATE TIME
public class DifferentFormats {

    private static void showDateFormats() {
        Date date = new Date(1000000000000L);
        List<DateFormat> dateFormats = new ArrayList<>();

        // Data
        dateFormats.add(DateFormat.getInstance());
        dateFormats.add(DateFormat.getDateInstance());
        dateFormats.add(DateFormat.getDateInstance(DateFormat.MEDIUM));
        dateFormats.add(DateFormat.getDateInstance(DateFormat.FULL));
        dateFormats.add(DateFormat.getDateInstance(DateFormat.LONG));
        dateFormats.add(DateFormat.getDateInstance(DateFormat.SHORT));

        // Output
        dateFormats.forEach(format -> System.out.println(format.format(date)));
    }

    private static void showSimpleDateFormats() {
        // Params
        Date date = new Date();
        SimpleDateFormat shortDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat shortDateTimeFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        SimpleDateFormat longDateFormat = new SimpleDateFormat("dd MMMM yyyy zzzz");
        SimpleDateFormat longDateTimeFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");

        // Output
        System.out.printf("Short Date: %s \n", shortDateFormat.format(date));
        System.out.printf("Short Date Time: %s \n", shortDateTimeFormat.format(date));
        System.out.printf("Long Date: %s \n", longDateFormat.format(date));
        System.out.printf("Long Date Time: %s \n", longDateTimeFormat.format(date));
    }

    public static void main(String[] args) {
        showDateFormats();
        showSimpleDateFormats();
    }
}