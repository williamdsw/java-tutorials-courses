package basic;

/**
 * @author William
 */
public class Casting {
    public static void main(String[] args) {
        testCasting();
    }

    private static void testCasting() {
        double myDouble = 3.14;
        int myInt = (int) myDouble;

        int otherInt = 35;
        double otherDouble = (double) otherInt;

        // Prints
        System.out.println("myDouble: " + myDouble);
        System.out.println("myDouble cast to int: " + myInt);
        System.out.println("otherInt: " + otherInt);
        System.out.println("otherInt cast to double: " + otherDouble);
    }
}