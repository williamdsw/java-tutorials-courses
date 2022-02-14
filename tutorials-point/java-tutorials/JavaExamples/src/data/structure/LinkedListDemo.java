package data.structure;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author William
 */

// DATA STRUCTURES
public class LinkedListDemo {
    public static void main(String[] args) {
        // Data
        LinkedList<Integer> numbers = new LinkedList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            numbers.add(random.nextInt(20));
        }

        // Output
        System.out.println(numbers);
        System.out.printf("First element: %s \n", numbers.getFirst());
        System.out.printf("Last element: %s \n", numbers.getLast());
    }
}