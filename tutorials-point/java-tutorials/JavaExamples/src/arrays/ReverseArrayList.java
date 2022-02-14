package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author William
 */

// ARRAYS
public class ReverseArrayList {
    public static void main(String[] args) {
        // Data
        List<String> data = new ArrayList<>();
        List<String> reversedData = new ArrayList<>();
        data.addAll(Arrays.asList("A", "B", "C", "D", "E"));
        reversedData.addAll(data);
        Collections.reverse(reversedData);

        // Output
        System.out.printf("Original Array List: %s \n", data);
        System.out.printf("Reversed Array List: %s \n", reversedData);
    }
}