package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class CustomExceptionDemo extends Exception {
    public static void main(String[] args) {
        try {
            throw new CustomException("My custom exception!");
        } catch (CustomException exception) {
            System.out.println(exception);
        }
    }
}