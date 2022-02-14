package advanced.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * @author William
 */

// SERIALIZATION
public class DeserializeDemo {
    private static final String FILE_PATH = "files/movie.ser";

    public static void main(String[] args) {
        try (FileInputStream fileInput = new FileInputStream(FILE_PATH)) {
            try (ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
                // Output
                Movie movie = (Movie) objectInput.readObject();
                System.out.println("Deserialized Movie data:");
                System.out.printf("Name: %s \n", movie.getName());
                System.out.printf("Release Dates: %s \n", Arrays.asList(movie.getReleaseDates()));
                System.out.printf("Running Time: %s min \n", movie.getRunningTime());
                System.out.printf("Countries: %s \n", Arrays.asList(movie.getCountries()));
                System.out.printf("Languages: %s \n", Arrays.asList(movie.getLanguages()));
                System.out.printf("Genres: %s \n", Arrays.asList(movie.getGenres()));
            } catch (ClassNotFoundException exception) {
                System.out.println("Movie class not found");
                exception.printStackTrace();
            }
        } catch (IOException exception) {
            System.out.println("File not found");
            exception.printStackTrace();
        }
    }
}