package arrays;

/**
 * @author William
 */

// ARRAYS
public class LinearSearch {
    public static void main(String[] args) {
        // Data
        int[] numbers = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int target = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                System.out.printf("Target found at index %d \n", index);
                break;
            }
        }
    }
}