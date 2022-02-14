package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author William
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        testAnonymousClass();
    }

    private static void testAnonymousClass() {
        // Data
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Barcelona", 10));
        teams.add(new Team("Liverpool", 12));
        teams.add(new Team("Juventus", 8));
        teams.add(new Team("Ajax", 7));

        // Implements anonymous class
        Comparator<Team> comparator = (Team first, Team second) -> {
            if (first.getNumberOfPoints() > second.getNumberOfPoints()) {
                return -1;
            } else if (first.getNumberOfPoints() < second.getNumberOfPoints()) {
                return 1;
            } else {
                return 0;
            }
        };

        // Uses to sort the collection
        Collections.sort(teams, comparator);
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            System.out.printf("Team: %s - Points: %d \n", team.getName(), team.getNumberOfPoints());
        }
    }
}
