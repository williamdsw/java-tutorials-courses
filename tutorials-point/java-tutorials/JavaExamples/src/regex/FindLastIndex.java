package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class FindLastIndex {
    public static void main(String[] args) {
        String phrase = "Its a wonderful world, an wonderful life";
        String regex = "wonderful";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phrase);
        matcher.find();
        int lastIndex = matcher.end();

        // Output
        System.out.println(phrase);
        System.out.printf("Last index of %s is %s \n", regex, lastIndex);
    }
}