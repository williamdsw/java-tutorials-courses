package arrays;

import java.util.Arrays;

/**
 * @author William
 */

// ARRAYS
public class SortInsert {

    private static int[] insertElementAt(int[] original, int element, int index) {
        int length = original.length;
        int[] newArray = new int[length + 1];
        System.arraycopy(original, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(original, index, newArray, index + 1, length - index);
        return newArray;
    }

    private static void printArray(String message, int[] array) {
        System.out.printf("%s :\n", message);
        for (int index = 0; index < array.length; index++) {
            String sepatator = (index != array.length - 1 ? "," : "");
            System.out.printf("%d%s ", array[index], sepatator);
        }
        System.out.println("");
    }

    // ------------------------------------------------------------------------//
    // MAIN

    public static void main(String[] args) {
        // Data
        int[] numbers = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int newNumber = 15;
        int index = 3;
        Arrays.sort(numbers);

        // Output
        printArray("Sorted Numbers", numbers);

        System.out.printf("Inserting number %d at index %d \n", newNumber, index);
        numbers = insertElementAt(numbers, newNumber, index);
        printArray("Numbers", numbers);
    }
}