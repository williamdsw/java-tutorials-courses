package advanced.generics;

/**
 * @author William
 */

// GENERIC METHOD
public class GenericMethodTest {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s, ", element);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Data
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
        Boolean[] boolArray = { false, true, true, false, true };
        String[] stringArray = { "first", "second", "third", "fourth", "fifth" };

        // Output
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        printArray(boolArray);
        printArray(stringArray);
    }
}