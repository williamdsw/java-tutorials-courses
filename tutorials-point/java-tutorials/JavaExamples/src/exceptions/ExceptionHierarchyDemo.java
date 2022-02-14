package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        try {
            throw new Mammal();
        } catch (Mammal exception) {
            System.err.println("Mammal exception");
        }
    }
}