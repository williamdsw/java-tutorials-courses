package strings;

/**
 * @author William
 */

// STRINGS
public class SplitString {
    public static void main(String[] args) {
        // Data
        String months = "january-february-march-april-may";
        String[] monthsArray = months.split("-");

        // Output
        System.out.println(months);
        for (String month : monthsArray) {
            System.out.println(month);
        }
    }
}