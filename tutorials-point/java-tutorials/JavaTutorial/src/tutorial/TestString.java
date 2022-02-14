package tutorial;

/**
 * @author William
 */
public class TestString {
    public static void main(String[] args) {
        String phrase = "Capcom vs SNK";
        String otherPhrase = phrase.concat(" Millenium Fight 2000 ");
        String newPhrase = phrase.replace("SNK", "Marvel");
        String otherNewPhrase = phrase.replaceAll("c", "k");
        String toLowercase = phrase.toLowerCase();
        String toUppercase = phrase.toUpperCase();
        String trim = phrase.trim();
        int length = phrase.length();
        char charAt = phrase.charAt(3);
        int compareTo = phrase.compareTo(phrase);
        int compareToIgnoringCase = phrase.compareToIgnoreCase("capcom vs snk");
        boolean contentEquals = phrase.contentEquals(new StringBuffer("Capcom vs SNK"));
        String copyValueOf = phrase.copyValueOf(new char[] { 'c', 'a', 'p' });
        boolean endsWith = phrase.endsWith("SNK");
        boolean equals = phrase.equals("Marvel vs Capcom");
        boolean equalsIgnoringCase = phrase.equalsIgnoreCase("capcom vs snk");
        byte[] bytes = phrase.getBytes();
        char[] strChars = new char[10];
        phrase.getChars(0, 5, strChars, 0);
        int hashCode = phrase.hashCode();
        int indexOf = phrase.indexOf('m');
        String intern = phrase.intern();
        int lastIndexOf = phrase.lastIndexOf('c');
        boolean matches = phrase.matches("Capcom");
        String[] split = phrase.split(" ");
        boolean startsWith = phrase.startsWith("Cap");
        CharSequence subSequence = phrase.subSequence(5, 10);
        String substring = phrase.substring(10);

        // Output
        System.out.printf("%s \n", phrase);
        System.out.printf("%s \n", otherPhrase);
        System.out.printf("%s \n", newPhrase);
        System.out.printf("%s \n", otherNewPhrase);
        System.out.printf("lowercase: %s \n", toLowercase);
        System.out.printf("UPPERCASE: %s \n", toUppercase);
        System.out.printf("trim: %s \n", trim);
        System.out.printf("%s length: %d \n", phrase, length);
        System.out.printf("%s charAt(3): %c \n", phrase, charAt);
        System.out.printf("%s compare to %s: %s \n", phrase, phrase, (compareTo == 0));
        System.out.printf("%s compareToIgnoringCase to %s: %s \n", phrase, phrase.toLowerCase(),
                (compareToIgnoringCase == 0));
        System.out.printf("%s contentEquals to %s: %s \n", phrase, new StringBuffer("Capcom vs SNK"), contentEquals);
        System.out.printf("copyValueOf %s: %s \n", phrase, copyValueOf);
        System.out.printf("%s endsWith SNK: %s \n", phrase, endsWith);
        System.out.printf("%s equals Marvel vs Capcom: %s \n", phrase, equals);
        System.out.printf("%s equalsIgnoringCase %s: %s \n", phrase, phrase.toLowerCase(), equalsIgnoringCase);
        System.out.printf("%s endsWith SNK: %s \n", phrase, endsWith);
        System.out.printf("%s bytes: %s \n", phrase, bytes);
        System.out.printf("%s hashCode: %d \n", phrase, hashCode);
        System.out.printf("%s indexOf ('m'): %d \n", phrase, indexOf);
        System.out.printf("%s intern: %s \n", phrase, intern);
        System.out.printf("%s lastIndexOf ('c'): %d \n", phrase, lastIndexOf);
        System.out.printf("%s matches Capcom: %s \n", phrase, matches);
        System.out.printf("%s split: %s \n", phrase, split);
        System.out.printf("%s startsWith Cap: %s \n", phrase, startsWith);
        System.out.printf("%s subSequence 5~10: %s \n", phrase, subSequence);
        System.out.printf("%s substring 10: %s \n", phrase, substring);
    }
}
