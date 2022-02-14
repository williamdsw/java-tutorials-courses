package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class CustomException extends Exception {

    private String message;

    public CustomException() {
    }

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}