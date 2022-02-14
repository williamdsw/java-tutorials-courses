package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class ChainedException {
    public static void main(String[] args) {
        try {
            int number = 20;
            int result = number / 0;
            System.out.printf("result: %s \n", result);
        } catch (ArithmeticException ae) {
            System.out.println(ae);

            try {
                throw new NumberFormatException();
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            }
        }
    }
}