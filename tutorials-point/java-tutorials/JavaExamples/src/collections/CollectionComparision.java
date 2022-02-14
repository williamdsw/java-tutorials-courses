package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author William
 */

// COLLECTIONS
public class CollectionComparision {
    public static void main(String[] args) {
        // Data
        String[] teams = { "Flamengo", "river plate", "Grêmio", "Atlético Nacional" };
        Set<String> teamSet = new TreeSet<>(Arrays.asList(teams));
        String min = Collections.min(teamSet);
        String minCaseInsensitiveOrder = Collections.min(teamSet, String.CASE_INSENSITIVE_ORDER);
        String max = Collections.max(teamSet);
        String maxCaseInsensitiveOrder = Collections.max(teamSet, String.CASE_INSENSITIVE_ORDER);

        // Output
        System.out.println(teamSet);
        System.out.printf("Min team = %s \n", min);
        System.out.printf("Min case insensitive order team = %s \n", minCaseInsensitiveOrder);
        System.out.printf("Max team = %s \n", max);
        System.out.printf("Max case insensitive order team = %s \n", maxCaseInsensitiveOrder);
    }
}