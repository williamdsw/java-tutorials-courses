package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author William
 */

// REGEX
public class MatchDuplicates {
    public static void main(String[] args) {
        List<String> allLines = new ArrayList<>();
        List<String> uniqueLines = new ArrayList<>();

        try {
            String phrase = "Its a wonderful world an wonderful life";
            String regexToMatch = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
            String regexToReplace = "$1";
            try (Scanner scanner = new Scanner(phrase)) {
                while (scanner.hasNext()) {
                    String currentLine = scanner.nextLine();
                    String delimitator = " ";
                    String[] lines = currentLine.split(delimitator);

                    for (String line : lines) {
                        if (line != null && !line.isEmpty()) {
                            allLines.add(line);
                        }
                    }
                }
            }

            // Output

            if (!allLines.isEmpty()) {
                System.out.println("Phrase:");
                System.out.println(allLines);

                for (String line : allLines) {
                    String result = line.replaceAll(regexToMatch, regexToReplace);
                    uniqueLines.add(result);
                }
            }

            if (!uniqueLines.isEmpty()) {
                System.out.println("After Regex:");
                System.out.println(uniqueLines);
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}