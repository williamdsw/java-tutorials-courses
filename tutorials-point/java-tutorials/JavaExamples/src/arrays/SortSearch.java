package arrays;

import java.util.Arrays;

/**
 * @author William
 */

// ARRAYS
public class SortSearch {
    private static void printArray(String message, int[] array) {
        System.out.printf("%s : [length: %d] \n", message, array.length);
        for (int index = 0; index < array.length; index++) {
            String sepatator = (index != array.length - 1 ? "," : "");
            System.out.printf("%d%s ", array[index], sepatator);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Data
        int[] numbers = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);
        int index = Arrays.binarySearch(sortedNumbers, 2);

        // Output
        printArray("Initial Numbers", numbers);
        printArray("Sorted Numbers", sortedNumbers);
        System.out.printf("Found 2 at index %d \n", index);
    }
}