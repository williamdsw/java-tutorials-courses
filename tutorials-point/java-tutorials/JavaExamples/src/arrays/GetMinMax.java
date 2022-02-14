package arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author William
 */

// ARRAYS
public class GetMinMax {
    public static void main(String[] args) {
        // Data
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        // Output
        System.out.printf("Numbers : %s \n", Arrays.toString(numbers));
        System.out.printf("Min : %d \n", min);
        System.out.printf("Max : %d \n", max);
    }
}