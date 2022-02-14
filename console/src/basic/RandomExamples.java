package basic;

import java.util.Random;

/**
 * @author William
 */
public class RandomExamples {
    private static final int MAX_NUMBER_OF_OCCURRENCES = 10;

    public static void main(String[] args) {
        testRandom();
    }

    private static void testRandom() {
        Random random = new Random();

        // Integer
        System.out.println("\n===== 10 Random Integers =====");
        for (int i = 0; i < MAX_NUMBER_OF_OCCURRENCES; i++) {
            System.out.println(random.nextInt());
        }

        // Long
        System.out.println("\n===== 10 Random Longs =====");
        for (int i = 0; i < MAX_NUMBER_OF_OCCURRENCES; i++) {
            System.out.println(random.nextLong());
        }

        // Float
        System.out.println("\n===== 10 Random Floats =====");
        for (int i = 0; i < MAX_NUMBER_OF_OCCURRENCES; i++) {
            System.out.println(random.nextFloat());
        }

        // Double
        System.out.println("\n===== 10 Random Doubles =====");
        for (int i = 0; i < MAX_NUMBER_OF_OCCURRENCES; i++) {
            System.out.println(random.nextDouble());
        }
    }
}