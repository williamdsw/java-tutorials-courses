package methods;

/**
 * @author William
 */

// METHODS - OVERLOADING
public class ArrayPrinterDemo {
    public static void main(String[] args) {
        // Data
        Integer[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10 };
        Character[] chars = { 'H', 'e', 'l', 'l', 'o' };
        String[] words = { "Night", "of", "fire" };

        // Output
        ArrayPrinter printer = new ArrayPrinter();
        printer.printArray(integers);
        printer.printArray(doubles);
        printer.printArray(chars);
        printer.printArray(words);
    }
}