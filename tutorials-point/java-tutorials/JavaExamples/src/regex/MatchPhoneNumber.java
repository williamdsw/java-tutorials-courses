package regex;

/**
 * @author William
 */

// REGEX
public class MatchPhoneNumber {
    private static void checkPhoneNumber(String phoneNumber) {
        String pattern = "(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}";
        boolean matched = phoneNumber.matches(pattern);
        System.out.printf("%s %s valid! \n", phoneNumber, matched ? "is" : "isn't");
    }

    public static void main(String[] args) {
        checkPhoneNumber("1-999-585-4009");
        checkPhoneNumber("999-585-4009");
        checkPhoneNumber("1-585-4009");
        checkPhoneNumber("585-4009");
        checkPhoneNumber("1.999-585-4009");
        checkPhoneNumber("999 585-4009");
        checkPhoneNumber("1 585 4009");
        checkPhoneNumber("111-Java2s");
    }
}