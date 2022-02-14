package strings;

/**
 * @author William
 */

// STRINGS
public class RegionMatch {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world";
        String otherPhrase = "Not a wonderful place";
        String substring = "wonderful";
        int startIndex = phrase.indexOf(substring);
        int otherStartIndex = otherPhrase.indexOf(substring);
        int length = substring.length();
        boolean hasMatch = phrase.regionMatches(startIndex, otherPhrase, otherStartIndex, length);

        // Output
        System.out.println(phrase);
        System.out.println(otherPhrase);
        System.out.printf("Phrases have matched in region? %s \n", hasMatch ? "Yes" : "No");
    }
}