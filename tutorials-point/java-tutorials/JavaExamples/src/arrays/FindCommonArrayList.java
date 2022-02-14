package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author William
 */

// ARRAYS
public class FindCommonArrayList {
    public static void main(String[] args) {
        // Data
        List<String> teams = new ArrayList<>();
        List<String> uclTeams = new ArrayList<>();
        List<String> commonTeams = new ArrayList<>();
        teams.addAll(Arrays.asList("Milan", "Internazionale", "Juventus", "Lazio", "Napoli", "Roma"));
        uclTeams.addAll(Arrays.asList("Juventus", "Napoli", "Roma"));
        commonTeams.addAll(teams);
        commonTeams.retainAll(uclTeams);

        // Output
        System.out.printf("Teams: %s \n", teams);
        System.out.printf("Teams in UCL: %s \n", uclTeams);
        System.out.printf("Common teams: %s \n", commonTeams);
    }
}