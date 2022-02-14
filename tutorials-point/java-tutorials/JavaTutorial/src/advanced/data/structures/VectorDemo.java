package advanced.data.structures;

import java.util.Vector;

/**
 * @author William
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector numbers = new Vector(3, 2);
        int size = numbers.size();
        int capacity = numbers.capacity();

        // Output
        System.out.printf(" Initial size of Vector of numbers: %d \n", size);
        System.out.printf(" Initial capacity of Vector of numbers: %d \n", capacity);

        // Adding (1)
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        capacity = numbers.capacity();
        System.out.printf(" Capacity after added 4 integers: %d \n", capacity);

        // Adding (2)
        numbers.add(5.45);
        capacity = numbers.capacity();
        System.out.printf(" Capacity after added 1 double: %d \n", capacity);

        // Adding (3)
        numbers.add(6.08);
        numbers.add(7);
        capacity = numbers.capacity();
        System.out.printf(" Capacity after added 2 numbers: %d \n", capacity);

        // Adding (4)
        numbers.add(8);
        numbers.add(9.4);
        numbers.add(10);
        capacity = numbers.capacity();
        System.out.printf(" Capacity after added 3 numbers: %d \n", capacity);

        // Others
        Integer firstElement = (Integer) numbers.firstElement();
        Integer lastElement = (Integer) numbers.lastElement();
        boolean contains8 = numbers.contains(8);

        System.out.printf(" First element of Numbers : %d \n", firstElement);
        System.out.printf(" Last element of Numbers : %d \n", lastElement);
        System.out.printf(" Vector contains the %d number ? %s \n", 8, (contains8 ? "Yes" : "No"));

        // Output
        System.out.println(" All numbers: ");
        numbers.forEach((number) -> {
            System.out.printf(" %s, ", number);
        });
        System.out.println("");
    }
}