package tutorial.files.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author William
 */
public class TestFileStreams {
    private static final String INPUT_FILE_PATH = "files/input.txt";
    private static final String OUTPUT_FILE_PATH = "files/output.txt";

    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(INPUT_FILE_PATH);
            writer = new FileWriter(OUTPUT_FILE_PATH);

            // Reads
            int currentByte;
            while ((currentByte = reader.read()) != -1) {
                writer.write(currentByte);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}