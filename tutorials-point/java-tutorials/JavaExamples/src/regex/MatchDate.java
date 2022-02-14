package regex;

/**
 * @author William
 */

// REGEX
public class MatchDate {

    private static void checkDate(String date) {
        String pattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
        boolean matched = date.matches(pattern);
        System.out.printf("%s %s valid! \n", date, matched ? "is" : "isn't");
    }

    public static void main(String[] args) {
        checkDate("8-08-1994");
        checkDate("8-8-1994");
        checkDate("8-8-94");
        checkDate("08/08/1994");
        checkDate("08/8/1994");
        checkDate("8/8/1994");
        checkDate("8/8/94");
    }
}