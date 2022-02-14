package data.structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * @author William
 */

// DATA STRUCTURES
public class MaxMinVector {
    public static void main(String[] args) {
        // Data
        Vector<Double> values = new Vector<>(Arrays.asList(2.09, 1.99, 10.55, 23.87, 100.11));
        double min = Collections.min(values);
        double max = Collections.max(values);

        // Output
        System.out.println(values);
        System.out.printf("Min: %s \n", min);
        System.out.printf("Max: %s \n", max);
    }
}