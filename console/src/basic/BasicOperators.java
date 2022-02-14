package basic;

/**
 * @author William
 */
public class BasicOperators {
    public static void main(String[] args) {
        testOperators();
    }

    private static void testOperators() {
        double a = 200;
        double b = 35;

        // Operations
        double sum = (a + b);
        double substract = (a - b);
        double multiply = (a * b);
        double divide = (a / b);
        double modulus = (a % b);

        System.out.printf("a = %.2f, b = %.2f \n", a, b);
        System.out.printf("Sum = %.2f \n", sum);
        System.out.printf("Substract = %.2f \n", substract);
        System.out.printf("Multiply = %.2f \n", multiply);
        System.out.printf("Divide = %.2f \n", divide);
        System.out.printf("Modulus = %.2f \n", modulus);
    }
}