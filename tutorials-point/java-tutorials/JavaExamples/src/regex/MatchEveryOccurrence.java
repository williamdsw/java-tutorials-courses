package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class MatchEveryOccurrence {
    public static void main(String[] args) {
        String phrase = "Its a wonderful world, an wonderful life";
        String regex = "\\ba\\w*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phrase);

        // Output
        System.out.printf("INPUT: %s \n", phrase);
        System.out.printf("REGEX: %s \n", regex);
        String matched = null;

        while (matcher.find()) {
            matched = matcher.group();
            System.out.printf("MATCH: %s \n", matched);
        }

        if (matched == null) {
            System.out.println("NO MATCHES.");
        }
    }
}