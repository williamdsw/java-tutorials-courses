package tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author William
 */
public class TestRegex {

    private static final String INPUT = "If you choose the wrong groove, you may just lose!";
    private static final String REGEX = "\\byou\\b";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        int count = 0;

        while (matcher.find()) {
            count++;
            System.out.println("Matcher number: " + count);
            System.out.println("start: " + matcher.start());
            System.out.println("end: " + matcher.end());
        }
    }
}