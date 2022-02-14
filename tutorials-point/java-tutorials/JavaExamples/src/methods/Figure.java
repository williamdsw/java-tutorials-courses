package methods;

/**
 * @author William
 */

// METHODS - OVERRIDING
public class Figure {

    protected double x;
    protected double y;

    public Figure() {
    }

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        System.out.println("Getting area for figure...");
        return x * y;
    }
}