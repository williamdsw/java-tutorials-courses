package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author William
 */

// ARRAYS
public class RemoveArrayList {
    public static void main(String[] args) {
        // Data
        List<String> teams = new ArrayList<>();
        List<String> uclTeams = new ArrayList<>();
        teams.addAll(Arrays.asList("Milan", "Internazionale", "Juventus", "Lazio", "Napoli", "Roma"));
        uclTeams.addAll(Arrays.asList("Juventus", "Napoli", "Roma"));

        // Output
        System.out.printf("Teams: %s \n", teams);
        System.out.printf("Teams in UCL: %s \n", uclTeams);
        teams.removeAll(uclTeams);
        System.out.printf("Teams not in UCL: %s \n", teams);
    }
}