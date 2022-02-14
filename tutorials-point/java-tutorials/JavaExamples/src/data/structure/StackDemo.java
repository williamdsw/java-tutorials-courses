package data.structure;

/**
 * @author William
 */

// DATA STRUCTURES
public class StackDemo {

    private static void stackAddition() {
        Stack stack = new Stack(10000);
        int number = 50;
        int total = 0;

        while (number > 0) {
            stack.push(number);
            --number;
        }

        while (!stack.isEmpty()) {
            int value = stack.pop();
            total += value;
        }

        System.out.printf("Total of stack: %s \n", total);
    }

    public static void main(String[] args) {
        stackAddition();
    }
}