package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class FirstLetterUppercase {
    public static void main(String[] args) {
        String phrase = "Its a wonderful world. An wonderful life";
        StringBuffer buffer = new StringBuffer();
        String regex = "([a-z])([a-z]*)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phrase);

        while (matcher.find()) {
            String uppercase = matcher.group(1).toUpperCase() + matcher.group(2).toLowerCase();
            matcher.appendReplacement(buffer, uppercase);
        }

        // Output
        System.out.printf("PHRASE: %s \n", phrase);
        System.out.printf("REGEX: %s \n", regex);
        System.out.printf("NEW PHRASE: %s \n", buffer.toString());
    }
}