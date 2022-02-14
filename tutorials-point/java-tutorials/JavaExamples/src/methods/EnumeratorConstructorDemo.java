package methods;

/**
 * @author William
 */

// METHODS - ENUMERATORS
public class EnumeratorConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Prices of all cars");
        for (MoreCars car : MoreCars.values()) {
            System.out.printf("%s - %dk \n", car, car.getPrice());
        }
    }
}