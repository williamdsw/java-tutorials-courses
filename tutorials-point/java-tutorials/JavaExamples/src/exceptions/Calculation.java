package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class Calculation {
    public double divideByZero(int number) throws Exception {
        return number / 0;
    }

    public int sum(int x, int y) throws Exception {
        return x + y;
    }

    public double sum(double x, double y) {
        return x + y;
    }
}