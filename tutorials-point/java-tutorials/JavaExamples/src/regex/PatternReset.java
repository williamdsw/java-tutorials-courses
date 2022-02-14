package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class PatternReset {
    public static void main(String[] args) {
        String phrase = "fix the rug with bags";
        String regex = "[frb][aiu][gx]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phrase);

        // Output
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        matcher.reset();

        // Output
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}