package methods;

/**
 * @author William
 */

// METHODS - BREAK
public class BreakDemo {
    public static void main(String[] args) {
        // Data
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int desired = 6;

        // Output
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == desired) {
                System.out.printf("Desired number %d found at index %d \n", desired, index);
                break;
            }
        }
    }
}