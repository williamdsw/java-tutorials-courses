package directories;

/**
 * @author William
 */

// DIRECTORIES
public class GetCurrentDirectory {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.printf("Current directory of project: %s \n", currentDirectory);
    }
}