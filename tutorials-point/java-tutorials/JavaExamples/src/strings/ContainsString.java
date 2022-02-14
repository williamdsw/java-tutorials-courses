package strings;

/**
 * @author William
 */

// STRINGS
public class ContainsString {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        String substring = "wonderful";
        boolean contains = phrase.contains(substring);

        // Output
        System.out.println(phrase);
        System.out.printf("The phrase %s contains substring %s. \n", contains ? "does" : "doesn't", substring);
    }
}