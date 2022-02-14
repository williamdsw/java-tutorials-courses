package data.structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * @author William
 */

// DATA STRUCTURES
public class SwapVector {
    public static void main(String[] args) {
        // Data
        Vector<Integer> numbers = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        Vector<Integer> numbersSwap = (Vector<Integer>) numbers.clone();
        Collections.swap(numbersSwap, 0, numbersSwap.size() - 1);

        // Output
        System.out.println(numbers);
        System.out.println(numbersSwap);
    }
}