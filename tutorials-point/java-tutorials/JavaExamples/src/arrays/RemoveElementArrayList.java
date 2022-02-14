package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author William
 */

// ARRAYS
public class RemoveElementArrayList {
    public static void main(String[] args) {
        // Data
        List<String> teams = new ArrayList<>();
        teams.addAll(Arrays.asList("Chelsea", "Arsenal", "Liverpool", "Manchester United"));
        List<String> originalTeams = new ArrayList<>(teams);
        String quit = teams.remove(2);

        // Output
        System.out.printf("Original teams: %s \n", originalTeams);
        System.out.printf("Teams after %s's quit: %s \n", quit, teams);
    }
}