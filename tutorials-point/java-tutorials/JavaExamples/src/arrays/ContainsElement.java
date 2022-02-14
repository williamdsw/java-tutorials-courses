package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author William
 */

// ARRAYS
public class ContainsElement {
    public static void main(String[] args) {
        // Data
        List<String> teams = new ArrayList<>();
        List<String> uclTeams = new ArrayList<>();
        teams.addAll(Arrays.asList("Milan", "Internazionale", "Juventus", "Lazio", "Napoli", "Roma"));
        uclTeams.addAll(Arrays.asList("Juventus", "Napoli", "Roma"));
        boolean containsMilan = teams.contains("Milan");
        boolean containsUCL = teams.containsAll(uclTeams);

        // Output
        System.out.printf("Teams: %s \n", teams);
        System.out.printf("Teams in UCL: %s \n", uclTeams);
        System.out.printf("Teams contains Milan ? %s \n", containsMilan ? "Yes" : "No");
        System.out.printf("Teams contains UCL teams ? %s \n", containsUCL ? "Yes" : "No");
    }
}