package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class PatternReplaceFirst {
    public static void main(String[] args) {
        String phrase = "Its a wonderful world. An wonderful life";
        String newPhrase = phrase;
        String regex = "wonderful";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newPhrase);
        newPhrase = matcher.replaceFirst("wenderfool");

        // Output
        System.out.printf("PHRASE: %s \n", phrase);
        System.out.printf("REGEX: %s \n", regex);
        System.out.printf("NEW PHRASE: %s \n", newPhrase);
    }
}