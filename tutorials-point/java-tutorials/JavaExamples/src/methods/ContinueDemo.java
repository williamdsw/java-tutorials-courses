package methods;

/**
 * @author William
 */

// METHODS - CONTINUE
public class ContinueDemo {
    public static void main(String[] args) {
        // Data
        StringBuilder phrase = new StringBuilder();
        phrase.append("It's a wonderful world, an wonderful place");
        int counter = 0;

        for (int index = 0; index < phrase.length(); index++) {
            if (phrase.charAt(index) != 'w') {
                continue;
            }
            counter++;
        }

        // Output
        System.out.println(phrase.toString());
        System.out.printf("Found %d w in phrase. \n", counter);
    }
}