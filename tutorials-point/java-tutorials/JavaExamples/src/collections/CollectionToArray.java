package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author William
 */

// COLLECTIONS
public class CollectionToArray {
    public static void main(String[] args) {
        // Data
        List<String> list = new ArrayList<>();
        list.add("Flamengo");
        list.add("River Plate");
        list.add("Grêmio");
        list.add("Atlético Nacional");
        String[] array = (String[]) list.toArray(new String[0]);

        // Output
        System.out.println(list);
        for (String team : array) {
            System.out.println(team);
        }
    }
}