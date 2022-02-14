package strings;

/**
 * @author William
 */

// STRINGS
public class ReverseStringBuffer {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        String reversedPhrase = new StringBuffer(phrase).reverse().toString();

        // Output
        System.out.println(phrase);
        System.out.println(reversedPhrase);
    }
}