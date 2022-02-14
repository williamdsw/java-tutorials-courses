package tutorial.files.io;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author William
 */
public class ReadConsole {
    private final static char QUIT_CHAR = 'q';

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = null;

        try {
            reader = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit!");

            // Shows input
            char currentChar;
            do {
                currentChar = (char) reader.read();
                System.out.println(currentChar);
            } while (currentChar != QUIT_CHAR);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}