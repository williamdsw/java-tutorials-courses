package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author William
 */
public class ListExample {
    public static void main(String[] args) {
        testList();
    }

    private static void testList() {
        // AbstractList, ArrayList, LinkedList ...
        List<String> teams = new ArrayList<>();

        // Fills
        teams.add("Manchester United");
        teams.add("Manchester City");
        teams.add("Liverpool");
        teams.add("Arsenal");
        teams.add("Tottenham");
        teams.add("Chelsea");

        // Iterates
        System.out.println("===== Teams =====");
        teams.forEach((team) -> {
            System.out.println(team);
        });

        // Helper functions
        System.out.printf("Contains Everton? %s \n", teams.contains("Everton") ? "Yes" : "No");
        System.out.printf("Team of index 2 = %s \n", teams.get(2));
        System.out.printf("Index of Chelsea = %d \n", teams.indexOf("Chelsea"));
        System.out.printf("Array List is empty? %s \n", teams.isEmpty() ? "Yes" : "No");
        System.out.printf("There is %d teams \n", teams.size());
        System.out.printf("%s isn't in the list anymore! \n", teams.set(0, "West Ham"));
        System.out.printf("%s was removed! \n", teams.remove(3));

        // Sorts list
        Collections.sort(teams);

        // Iterates
        System.out.println("===== Teams Sorted =====");
        teams.forEach((team) -> {
            System.out.println(team);
        });

        // Cleans the list
        teams.clear();
    }
}