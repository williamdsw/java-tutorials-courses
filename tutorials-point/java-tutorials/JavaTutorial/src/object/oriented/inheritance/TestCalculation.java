
package object.oriented.inheritance;

import java.util.Random;

/**
 * @author William
 */
public class TestCalculation {
    public static void main(String[] args) {
        // Values
        Random random = new Random();
        int x = random.nextInt(100);
        int y = random.nextInt(100);

        // Results
        MoreCalculation calc = new MoreCalculation();
        calc.addition(x, y);
        calc.substraction(x, y);
        calc.multiplication(x, y);
        calc.division(x, y);
    }
}