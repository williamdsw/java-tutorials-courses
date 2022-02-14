package basic;

import java.util.Random;

/**
 * @author William
 */
public class Arrays {
    public static void main(String[] args) {
        testArrays();
    }

    private static void testArrays() {
        // Defined array
        System.out.println("===== Teams =====");
        String[] teams = new String[] { "Corinthians", "Palmeiras", "Santos", "São Paulo" };
        for (String team : teams) {
            System.out.println(team);
        }

        // Fills empty array
        System.out.println("===== Random Numbers =====");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(50);
            System.out.printf("%d was added to array \n", numbers[i]);
        }
    }
}