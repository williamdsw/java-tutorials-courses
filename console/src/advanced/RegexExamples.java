package advanced;

/**
 * @author William
 */
public class RegexExamples {
    public static void main(String[] args) {
        testRegex();
    }

    private static void testRegex() {
        String pattern = null;

        // Matching symbols
        pattern = "."; // Any character
        pattern = "^"; // Matches begin of line
        pattern = "^regex"; // Find 'regex' at begin
        pattern = "regex$"; // Find 'regex' at end
        pattern = "[abc]"; // Find definition with 'a', 'b', 'c'
        pattern = "[abc][xz]"; // Find definition with 'a', 'b', 'c' or 'x', 'z'
        pattern = "[^abc]"; // Find any character not in definition
        pattern = "[a-d1-7]"; // Find letter between 'a-d' and digit between '1-7'
        pattern = "Y|Z"; // Find 'Y' or 'Z'
        pattern = "YZ"; // Find Y and Z in sequence
        pattern = "$"; // Matches end of line

        // Meta characters
        pattern = "\\d"; // Any digit, shortcut to '[0-9]'
        pattern = "\\D"; // Non digit, shortcut to '[^0-9]'
        pattern = "\\s"; // White-space, shortcut to '[\\t\\n\\x0b\\r\\f]'
        pattern = "\\S"; // Non white-spaces
        pattern = "\\w"; // Any character / digit, shortcut to '[a-zA-Z_0-9]'
        pattern = "\\W"; // Non character, shortcut to '[^\w]'
        pattern = "\\S+"; // Non-whitespaces
        pattern = "\\b"; // Matches a boundary where a character is '[a-zA-Z_0-9]'

        // Quantifiers
        pattern = "*"; // Occurs zero or any ocorrences, shortcut to '{0,}'
        pattern = "+"; // Occurs one or any ocorrences, shortcut to '{1,}'
        pattern = "?"; // Occurs zero or one ocorrence, shortcut to '{0,1}'
        pattern = "{X}"; // Occurs any times, example: '[0-9]{5}'
        pattern = "{X,Y}"; // Occurs between X and Y times, example: '[0-9]{3,5}'
        pattern = "*?"; // Find a minor ocorrence, and later the first ocorrence

        // Example
        String word = "regex";

        if (word.matches("regex")) {
            System.out.println(String.format("The %s matches the word 'regex'", word));
        }

        // Split with regex
        word = "This is where 'regex' appears to times like 'regex'";
        String[] words = word.split("regex");
        for (String w : words) {
            System.out.print(w + " ");
        }
    }
}