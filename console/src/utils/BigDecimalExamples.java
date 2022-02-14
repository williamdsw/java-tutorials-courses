package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author William
 */
public class BigDecimalExamples {
    public static void main(String[] args) {
        showBigDecimalExamples();
    }

    private static void showBigDecimalExamples() {
        BigDecimal decimal = new BigDecimal("19.99");
        BigDecimal otherDecimal = new BigDecimal("2.00");

        // Basic operations
        BigDecimal sum = decimal.add(otherDecimal);
        BigDecimal substract = decimal.subtract(otherDecimal);
        BigDecimal multiply = decimal.multiply(otherDecimal);
        BigDecimal divide = decimal.divide(otherDecimal);

        // Other operations
        BigDecimal maximum = decimal.max(otherDecimal);
        BigDecimal minimum = decimal.min(otherDecimal);
        BigDecimal absolute = decimal.abs();
        BigDecimal pow = decimal.pow(2);
        BigDecimal remainder = decimal.remainder(otherDecimal);

        // Helper functions
        Integer precision = decimal.precision();
        Integer compareTo = decimal.compareTo(otherDecimal);

        // Currencies formats
        BigDecimal anotherDecimal = new BigDecimal("10400.99");
        String brazilianReal = NumberFormat.getCurrencyInstance().format(anotherDecimal);
        String dollar = NumberFormat.getCurrencyInstance(Locale.US).format(anotherDecimal);
        String pound = NumberFormat.getCurrencyInstance(Locale.UK).format(anotherDecimal);

        // Output
        System.out.printf("Decimal: %s \n", decimal);
        System.out.printf("Other decimal: %s \n", otherDecimal);
        System.out.printf("Sum: %s \n", sum);
        System.out.printf("Substract: %s \n", substract);
        System.out.printf("Multiply: %s \n", multiply);
        System.out.printf("Divide: %s \n", divide);
        System.out.printf("Maximum: %s \n", maximum);
        System.out.printf("Minimum: %s \n", minimum);
        System.out.printf("Absolute of %s: %s \n", decimal, absolute);
        System.out.printf("Pow of %s: %s \n", decimal, pow);
        System.out.printf("Remainder: %s \n", remainder);
        System.out.printf("Precision of %s: %s \n", decimal, precision);
        System.out.printf("%s is equal to %s ? %s \n", decimal, otherDecimal, compareTo == 0 ? "Yes" : "No");
        System.out.printf("%s with other scale: %s \n", decimal, decimal.setScale(3, RoundingMode.UP));
        System.out.printf("%s with other scale: %s \n", otherDecimal, otherDecimal.setScale(10, RoundingMode.UP));
        System.out.printf("Another decimal: %s \n", anotherDecimal);
        System.out.printf("Another decimal formated to Real: %s \n", brazilianReal);
        System.out.printf("Another decimal formated to Dollar: %s \n", dollar);
        System.out.printf("Another decimal formated to Pound: %s \n", pound);
    }
}