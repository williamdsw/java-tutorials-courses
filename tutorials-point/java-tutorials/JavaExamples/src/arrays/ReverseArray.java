package arrays;

/**
 * @author William
 */

// ARRAYS
public class ReverseArray {

    private static int[] reverse(int[] original) {
        int[] destination = new int[original.length];
        int counter = 0;

        for (int index = original.length - 1; index >= 0; index--) {
            destination[counter] = original[index];
            counter++;
        }

        return destination;
    }

    private static void printArray(String message, int[] array) {
        System.out.printf("%s :\n", message);
        for (int index = 0; index < array.length; index++) {
            String sepatator = (index != array.length - 1 ? "," : "");
            System.out.printf("%d%s ", array[index], sepatator);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Data
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] reversedNumbers = reverse(numbers);

        // Output
        printArray("Numbers", numbers);
        printArray("Reversed Numbers", reversedNumbers);
    }
}