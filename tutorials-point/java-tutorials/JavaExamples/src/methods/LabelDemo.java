package methods;

/**
 * @author William
 */

// METHODS - LABEL
public class LabelDemo {
    public static void main(String[] args) {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        String substring = "world";
        boolean wasFound = false;
        int maxLength = (phrase.length() - substring.length());

        testLabel: for (int i = 0; i <= maxLength; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;

            while ((length--) != 0) {
                if (phrase.charAt(j++) != substring.charAt(k++)) {
                    continue testLabel;
                }
            }

            wasFound = true;
            break;
        }

        // Output
        System.out.printf("Phrase: %s \n", phrase);
        System.out.printf("Substring: %s \n", substring);
        System.out.printf("Substring %s founded in Phrase. \n", wasFound ? "was" : "was not");
    }
}