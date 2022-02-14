package advanced.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

/**
 * @author William
 */

// SERIALIZATION
public class SerializeDemo {
    private static final String FILE_PATH = "files/movie.ser";

    public static void main(String[] args) {
        // Data
        Movie movie = new Movie();
        movie.setName("Rocky");
        movie.setReleaseDates(new LocalDate[] { LocalDate.parse("1976-11-21"), LocalDate.parse("1976-12-03") });
        movie.setRunningTime(119);
        movie.setCountries(new String[] { "United States" });
        movie.setLanguages(new String[] { "English" });
        movie.setGenres(new String[] { "Sports", "Drama" });

        try (FileOutputStream fileOutput = new FileOutputStream(FILE_PATH)) {
            try (ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
                objectOutput.writeObject(movie);
                System.out.printf("Serialize data is saved in %s \n", FILE_PATH);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}