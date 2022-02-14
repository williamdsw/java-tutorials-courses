package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class ExceptionOverloaded {
    public static void main(String[] args) {
        try {
            // Data
            Calculation calculation = new Calculation();
            double dividedByZero = calculation.divideByZero(10);
            int total = calculation.sum(10, 15);
            double otherTotal = calculation.sum(11.12, 10.55);

            // Output
            System.out.printf("Divided by Zero: %s \n", dividedByZero);
            System.out.printf("Total: %s \n", total);
            System.out.printf("Other total: %s \n", otherTotal);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}