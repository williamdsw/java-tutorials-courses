package strings;

/**
 * @author William
 */

// STRINGS
public class SearchOccurrence {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        String substring = "wonderful";
        int indexOf = phrase.indexOf(substring);

        // Output
        System.out.println(phrase);
        if (indexOf == -1) {
            System.out.printf("%s not found!\n", substring);
        } else {
            System.out.printf("First occurrence of %s is at index %d. \n", substring, indexOf);
        }
    }
}