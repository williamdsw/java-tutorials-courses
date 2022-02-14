package utils;

/**
 * @author William
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        testStringBuilder();
    }

    private static void testStringBuilder() {
        // StringBuffer or StringBuilder ...
        StringBuilder builder = new StringBuilder("London Bridge");
        System.out.println(builder.toString());

        // Helper functions
        System.out.println(builder.append(" is falling down.").toString());
        System.out.println(builder.insert(17, "not ").toString());
        System.out.println(builder.delete(7, 13).toString());
        System.out.println(builder.deleteCharAt(builder.length() - 1).toString());
        System.out.println(builder.replace(0, 6, "Manchester"));
        System.out.printf("Capacity: %d \n", builder.capacity());
        System.out.printf("Length: %d \n", builder.length());
    }
}