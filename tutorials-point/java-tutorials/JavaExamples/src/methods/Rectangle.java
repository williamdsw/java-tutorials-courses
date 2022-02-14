package methods;

/**
 * @author William
 */

// METHODS - OVERRIDING
public class Rectangle extends Figure {
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getArea() {
        System.out.println("Getting area for rectangle...");
        return x * y;
    }
}