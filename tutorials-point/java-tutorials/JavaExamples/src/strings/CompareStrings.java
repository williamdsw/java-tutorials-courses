package strings;

/**
 * @author William
 */

// STRINGS
public class CompareStrings {
    public static void main(String[] args) {
        // Data
        String title = "Initial D";
        String otherTitle = "initial d";
        Object titleObject = title;

        // Output
        System.out.printf("%s compareTo %s = %s \n", title, otherTitle, title.compareTo(otherTitle));
        System.out.printf("%s compareToIgnoreCase %s = %s \n", title, otherTitle,
                title.compareToIgnoreCase(otherTitle));
        System.out.printf("%s compareTo %s = %s \n", title, otherTitle, title.compareTo(titleObject.toString()));
    }
}