package advanced.generics;

import java.util.Random;

/**
 * @author William
 */

// GENERIC CLASS TEST
public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
        Box<Boolean> booleanBox = new Box<>();
        Box<String> stringBox = new Box<>();

        // Data
        integerBox.add(100);
        doubleBox.add(33.45);
        booleanBox.add(false);
        stringBox.add("Something...");

        // Output
        System.out.printf("Integer value : %d \n", integerBox.get());
        System.out.printf("Double value : %f \n", doubleBox.get());
        System.out.printf("Boolean value : %b \n", booleanBox.get());
        System.out.printf("String value : %s \n", stringBox.get());
    }
}