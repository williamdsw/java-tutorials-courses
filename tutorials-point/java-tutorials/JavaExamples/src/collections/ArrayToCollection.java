package collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author William
 */

// COLLECTIONS
public class ArrayToCollection {
    public static void main(String[] args) {
        // Data
        String[] teamArray = { "Flamengo", "River Plate", "Grêmio", "Atlético Nacional" };
        List<String> teamList = Arrays.asList(teamArray);

        // Output
        for (String team : teamArray) {
            System.out.println(team);
        }

        System.out.println(teamList);
    }
}