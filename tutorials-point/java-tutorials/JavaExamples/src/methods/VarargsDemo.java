package methods;

/**
 * @author William
 */

// METHODS
public class VarargsDemo {
    private static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static void main(String[] args) {
        // Data
        int a = sum(1, 2);
        int b = sum(3, 5, 10);
        int c = sum(4, 10, 11, 2);

        // Output
        System.out.printf("%d + %d = %d \n", 1, 2, a);
        System.out.printf("%d + %d + %d = %d \n", 3, 5, 10, b);
        System.out.printf("%d + %d + %d + %d = %d \n", 4, 10, 11, 2, c);
    }
}