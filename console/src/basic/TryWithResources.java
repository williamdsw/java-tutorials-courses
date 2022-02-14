package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author William
 */
public class TryWithResources {
    private static final String FILE_PATH = "my-file.txt";

    public static void main(String[] args) {
        createFile();
        readFile();
    }

    /**
     * Creates an file
     */
    private static void createFile() {
        try {
            // Content
            StringBuilder builder = new StringBuilder();
            builder.append("London Bridge is falling down,\n");
            builder.append("Falling down, falling down.\n");
            builder.append("London Bridge is falling down,\n");
            builder.append("My fair lady.");

            try (FileWriter writer = new FileWriter(FILE_PATH)) {
                writer.append(builder);
            }

            // Checks
            if (new File(FILE_PATH).exists()) {
                System.out.println("File created");
            } else {
                System.out.println("Error on file's creation!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFile() {
        try {
            String line = "";

            // Read
            try (FileReader fileReader = new FileReader(FILE_PATH)) {
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            }

            // Delete
            File file = new File(FILE_PATH);
            file.delete();

            // Checks
            if (!new File(FILE_PATH).exists()) {
                System.out.println("File readed and deleted.");
            } else {
                System.out.println("File readed but failed to delete.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}