package strings;

import java.util.Locale;

/**
 * @author William
 */

// STRINGS
public class StringFormat {
    public static void main(String[] args) {
        double price = 29.99;
        String germanPrice = String.format(Locale.GERMANY, "%f%n", price);

        // Output
        System.out.println(price);
        System.out.println(germanPrice);
    }
}