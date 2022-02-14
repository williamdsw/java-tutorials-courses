package strings;

/**
 * @author William
 */

// STRINGS
public class CompareStringsEquals {
    public static void main(String[] args) {
        // Data
        String title = "Initial D";
        String otherTitle = "Initial D";
        String anotherTitle = new String("INITIAL D");

        // Output
        System.out.printf("%s equals %s = %s \n", title, otherTitle, title.equals(otherTitle));
        System.out.printf("%s equals %s = %s \n", otherTitle, anotherTitle, otherTitle.equals(anotherTitle));
    }
}