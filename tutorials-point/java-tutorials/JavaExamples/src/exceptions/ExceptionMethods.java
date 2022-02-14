package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception exception) {
            System.out.println("Exception data:");
            System.out.printf("Message: %s \n", exception.getMessage());
            System.out.printf("Localized Message: %s \n", exception.getLocalizedMessage());
            System.out.printf("Class: %s \n", exception.getClass());
            System.out.printf("to String: %s \n", exception);
            System.out.println("Print Stack Trace:");
            exception.printStackTrace();
        }
    }
}