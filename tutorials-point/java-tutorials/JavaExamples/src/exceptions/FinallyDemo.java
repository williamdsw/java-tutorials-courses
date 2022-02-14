package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.printf("Data inside try... %s \n", data);
        } catch (NullPointerException exception) {
            System.out.println("Inside catch...");
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Inside finally...");
        }

        System.out.println("Rest of code...");
    }
}