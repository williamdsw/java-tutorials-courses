package methods;

/**
 * @author William
 */

// METHODS
public class FibonacciDemo {
    public static long getFibonacciSequence(long number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return getFibonacciSequence(number - 1) + getFibonacciSequence(number - 2);
        }
    }

    public static void main(String[] args) {
        for (int number = 0; number <= 30; number++) {
            long sequence = getFibonacciSequence(number);
            System.out.printf("Fibonacci of %s is %s \n", number, sequence);
        }
    }
}