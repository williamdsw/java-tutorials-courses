package regex;

/**
 * @author William
 */

// REGEX
public class MatchEmail {
    private static void checkEmail(String email) {
        String pattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        boolean matched = email.matches(pattern);
        System.out.printf("%s %s valid! \n", email, matched ? "is" : "isn't");
    }

    public static void main(String[] args) {
        checkEmail("user@domain.com");
        checkEmail("user@com");
        checkEmail("user@domain.com.br");
        checkEmail("user_@domain.com.br");
        checkEmail("user_user@domain.com.br");
        checkEmail("user.user@domain.com.br");
    }
}