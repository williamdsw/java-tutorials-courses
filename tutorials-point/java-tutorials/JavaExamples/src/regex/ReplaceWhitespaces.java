package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class ReplaceWhitespaces {
    public static void main(String[] args) {
        String phrase = "Its a wonderful world, an wonderful life";
        String newPhrase = phrase;
        String regex = "[\\s]";
        String replace = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newPhrase);
        newPhrase = matcher.replaceAll(replace);

        // Output
        System.out.println(phrase);
        System.out.println(newPhrase);
    }
}