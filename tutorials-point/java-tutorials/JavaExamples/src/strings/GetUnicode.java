package strings;

/**
 * @author William
 */

// STRINGS
public class GetUnicode {
    public static void main(String[] args) {
        // Data
        String title = "Initial D";

        // Output
        System.out.println(title);
        for (int index = 0; index < title.length(); index++) {
            char currentChar = title.charAt(index);
            int unicode = title.codePointAt(index);
            System.out.printf("char: %s - unicode: %d \n", currentChar, unicode);
        }
    }
}