package object.oriented.inheritance;

/**
 * @author William
 */
public class MoreCalculation extends Calculation {
    public void multiplication(int x, int y) {
        result = x * y;
        System.out.printf("%d * %d = %d \n", x, y, result);
    }

    public void division(int x, int y) {
        result = x / y;
        System.out.printf("%d / %d = %d \n", x, y, result);
    }
}