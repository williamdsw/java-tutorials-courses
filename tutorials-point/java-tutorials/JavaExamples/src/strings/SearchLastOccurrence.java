package strings;

/**
 * @author William
 */

// STRINGS
public class SearchLastOccurrence {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        String substring = "wonderful";
        int lastIndexOf = phrase.lastIndexOf(substring);

        // Output
        System.out.println(phrase);
        if (lastIndexOf == -1) {
            System.out.printf("%s not found!\n", substring);
        } else {
            System.out.printf("Last occurrence of %s is at index %d. \n", substring, lastIndexOf);
        }
    }
}