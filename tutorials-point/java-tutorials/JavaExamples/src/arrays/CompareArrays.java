package arrays;

import java.util.Arrays;

/**
 * @author William
 */

// ARRAYS
public class CompareArrays {
    public static void main(String[] args) {
        // Data
        int[] firstArray = { 1, 2, 3, 4, 5 };
        int[] secondArray = { 1, 2, 3, 4, 5 };
        boolean equals = Arrays.equals(firstArray, secondArray);

        // Output
        System.out.printf("First array: %s \n", Arrays.toString(firstArray));
        System.out.printf("Second array: %s \n", Arrays.toString(secondArray));
        System.out.printf("They are equals ? %s \n", equals ? "Yes" : "No");
    }
}