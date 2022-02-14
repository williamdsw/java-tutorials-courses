package tutorial.files.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author William
 */
public class TestByteStreams {
    private static final String INPUT_FILE_PATH = "files/input.txt";
    private static final String OUTPUT_FILE_PATH = "files/output.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream(INPUT_FILE_PATH);
            output = new FileOutputStream(OUTPUT_FILE_PATH);

            // Reads
            int currentByte;
            while ((currentByte = input.read()) != -1) {
                output.write(currentByte);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}