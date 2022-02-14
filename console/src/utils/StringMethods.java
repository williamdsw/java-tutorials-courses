package utils;

/**
 * @author William
 */
public class StringMethods {
    public static void main(String[] args) {
        testStringMethods();
    }

    private static void testStringMethods() {
        // Original phrase
        String phrase = "London Bridge is falling down, falling down, falling down, London Bridge is falling down, my fair lady ";
        System.out.println(phrase);

        // Cases
        phrase = phrase.toUpperCase();
        System.out.println("UpperCase: " + phrase);

        phrase = phrase.toLowerCase();
        System.out.println("LowerCase: " + phrase);

        System.out.println("length: " + phrase.length());

        // Comparision
        System.out.printf("Phrash %s with 'london' \n", phrase.startsWith("london") ? "does start" : "doesn't start");
        System.out.printf("Phrash %s with 'bridge' \n", phrase.endsWith("bridge") ? "does end" : "doesn't end");
        System.out.printf("'London' is equal to 'London'? %s \n", "London".compareTo("London") == 0 ? "Yes" : "No");

        // Ocorrences
        System.out.printf("Index of first ocorrence of 'london' = %d \n", phrase.indexOf("london"));
        System.out.printf("Index of last ocorrence of 'london' = %d \n", phrase.lastIndexOf("london"));

        // Substrings
        phrase = phrase.replace("london", "manchester");
        System.out.println(phrase);

        phrase = phrase.substring(phrase.lastIndexOf("falling"), phrase.lastIndexOf("down") + 4);
        System.out.println("Because I'm ".concat(phrase));

        // Whitespace helpers
        System.out.printf("phrase is empty? %s \n", phrase.isEmpty() ? "Yes" : "No");
        phrase = phrase.trim();
        System.out.printf("phrase without spaces: %s \n", phrase);

        // Splits into array
        String[] characters = phrase.split("");
        for (String str : characters) {
            System.out.println(str);
        }
    }
}