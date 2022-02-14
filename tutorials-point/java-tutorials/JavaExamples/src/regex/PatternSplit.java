package regex;

import java.util.regex.Pattern;

/**
 * @author William
 */

// REGEX
public class PatternSplit {
    public static void main(String[] args) {
        String phrase = "Its a wonderful world. An wonderful life";
        String regex = "(on|or|ul|ld)";
        Pattern pattern = Pattern.compile(regex);
        String[] lines = pattern.split(phrase);

        // Output
        System.out.printf("PHRASE: %s \n", phrase);
        System.out.printf("REGEX: %s \n", regex);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}