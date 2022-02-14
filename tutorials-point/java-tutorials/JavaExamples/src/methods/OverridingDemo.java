package methods;

/**
 * @author William
 */

// METHODS - OVERLOADING
public class OverridingDemo {
    public static void main(String[] args) {
        // Data
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        double figureArea = figure.getArea();
        double rectangleArea = rectangle.getArea();

        // Output
        System.out.printf("Area of figure: %f \n", figureArea);
        System.out.printf("Area of rectangle: %f \n", rectangleArea);
    }
}