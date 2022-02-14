package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class MatchGroupCount {
    public static void main(String[] args) {
        String phrase = "Its a wonderful world. An wonderful life";
        String regex = "wo(nderful)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phrase);
        int groupCount = matcher.groupCount();

        // Output
        System.out.printf("PHRASE: %s \n", phrase);
        System.out.printf("REGEX: %s \n", regex);
        System.out.printf("GROUP COUNT: %s \n", groupCount);
    }
}