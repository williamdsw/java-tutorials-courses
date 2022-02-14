package strings;

/**
 * @author William
 */

// STRINGS
public class ConcatenateStrings {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world";
        String otherPhrase = "It's an wonderful place";
        String bothPhrase = phrase.concat(",").concat(otherPhrase);

        // Output
        System.out.println(phrase);
        System.out.println(otherPhrase);
        System.out.println(bothPhrase);
    }
}