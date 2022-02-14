package strings;

/**
 * @author William
 */

// STRINGS
public class ComparePerformance {

    private final static int NUMBER_OF_OCCURRENCES = 100000000;

    private static void createLiteralString() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_OCCURRENCES; i++) {
            String hello = "Hello";
            String world = "World";
        }

        long end = System.currentTimeMillis();

        // Output
        System.out.printf("Created literal strings in %d ms!\n", (end - start));
    }

    private static void createObjectString() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < NUMBER_OF_OCCURRENCES; i++) {
            String hello = new String("Hello");
            String world = new String("World");
        }

        long end = System.currentTimeMillis();

        // Output
        System.out.printf("Created object strings in %s ms!\n", (end - start));
    }

    public static void main(String[] args) {
        createLiteralString();
        createObjectString();
    }
}