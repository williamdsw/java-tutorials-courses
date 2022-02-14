package strings;

/**
 * @author William
 */

// STRINGS
public class ReverseStringCharArray {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        char[] phraseChars = phrase.toCharArray();
        String reversedPhrased = "";

        for (int index = phraseChars.length - 1; index >= 0; index--) {
            reversedPhrased += phraseChars[index];
        }

        // Output
        System.out.println(phrase);
        System.out.println(reversedPhrased);
    }
}