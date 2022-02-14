package methods;

/**
 * @author William
 */

// METHODS - OVERLOADING
public class CalculationDemo {
    public static void main(String[] args) {
        // Data
        int a = 10;
        int b = 3;
        double x = 3.44;
        double y = 152.09;

        Calculator calculator = new Calculator();
        int c = calculator.sum(a, b);
        double z = calculator.sum(x, y);

        // Output
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.printf("%f + %f = %f \n", x, y, z);
    }
}