package strings;

/**
 * @author William
 */

// STRINGS
public class ReplaceSubstring {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        String otherPhrase = phrase.replace('w', 'm');
        String anotherPhrase = phrase.replaceFirst("a", "the");
        String lastPhrase = phrase.replaceAll("on", "en");

        // Output
        System.out.println(phrase);
        System.out.println(otherPhrase);
        System.out.println(anotherPhrase);
        System.out.println(lastPhrase);
    }
}