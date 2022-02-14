package tutorial;

/**
 * @author William
 */
public class TestCharacters {
    public static void main(String[] args) {
        char[] characters = { 'a', '1', ' ', 'A' };
        for (char c : characters) {
            System.out.printf("%c is ...", c);
            if (Character.isLetter(c)) {
                System.out.print(" Letter, ");
            }
            if (Character.isDigit(c)) {
                System.out.print(" Digit, ");
            }
            if (Character.isWhitespace(c)) {
                System.out.print(" Whitespace, ");
            }
            if (Character.isLowerCase(c)) {
                System.out.print(" LowerCase, ");
            }
            if (Character.isUpperCase(c)) {
                System.out.print(" UpperCase, ");
            }
            System.out.println("");
        }
    }
}
