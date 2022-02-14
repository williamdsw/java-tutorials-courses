package advanced.generics;

/**
 * @author William
 */

// BOUNDED TYPE PARAMETERS
public class BoundedTypeTest {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        // Data
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Double d = 100.99;
        Double e = 34.5;
        Double f = 1.010;
        String g = "Iron Maiden";
        String h = "Slayer";
        String i = "Metallica";

        Integer maxInteger = maximum(a, b, c);
        Double maxDouble = maximum(d, e, f);
        String maxString = maximum(g, h, i);

        // Output
        System.out.printf("Max of %d, %d, %d = %d \n", a, b, c, maxInteger);
        System.out.printf("Max of %f, %f, %f = %f \n", d, e, f, maxDouble);
        System.out.printf("Max of %s, %s, %s = %s \n", g, h, i, maxString);
    }
}