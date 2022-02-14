package utils;

import java.util.StringTokenizer;

/**
 * @author William
 */
public class StringTokenizerExample {
    public static void main(String[] args) {
        testStringTokenizer();
    }

    private static void testStringTokenizer() {
        StringTokenizer tokenizer = new StringTokenizer("2019-04-26", "-");
        String token;

        System.out.println("2019-04-26");
        System.out.printf("Number of tokens: %d \n", tokenizer.countTokens());

        // Iterates
        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}