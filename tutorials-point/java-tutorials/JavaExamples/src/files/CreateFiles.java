package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * @author William
 */

// FILES
public class CreateFiles {

    private static void createUsingFileClass() throws IOException {
        File file = new File("files/first_file.txt");
        boolean fileCreated = file.createNewFile();

        System.out.printf("File %s created! \n", fileCreated ? "was" : "was not");

        // Data
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Test data first file");
        }
    }

    private static void createUsingFileOutputStreamClass() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("files/second_file.txt")) {
            String data = "Test data second file";
            fileOutputStream.write(data.getBytes());
        }
    }

    private static void createUsingNIO() throws IOException {
        List<String> data = Arrays.asList("Test", "data", "third", "file");
        String filePath = "files/third_file.txt";
        Files.write(Paths.get(filePath), data, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    public static void main(String[] args) {
        try {
            createUsingFileClass();
            createUsingFileOutputStreamClass();
            createUsingNIO();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}