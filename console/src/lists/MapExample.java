package lists;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author William
 */
public class MapExample {
    public static void main(String[] args) {
        testMap();
    }

    private static void testMap() {
        // HashMap, LinkedHashMap, Hashtable ...
        Map<String, Integer> eventYears = new HashMap<>();

        // Adding
        eventYears.put("World War I", 1914);
        eventYears.put("World War II", 1939);
        eventYears.put("The American Revolution", 1775);
        eventYears.put("The Reformation", 1517);
        eventYears.put("Tearing Down of the Berlin Wall", 1989);

        // Iterates
        System.out.println("===== Events =====");
        eventYears.forEach((key, value) -> {
            System.out.printf("%s happened in %d \n", key, value);
        });

        // Verifies key and value
        System.out.printf("Contains the key Cold War ? %s \n", eventYears.containsKey("Cold War") ? "Yes" : "No");
        System.out.printf("Contains the key 1999 ? %s \n", eventYears.containsValue(1999) ? "Yes" : "No");

        // Iterates Keys
        System.out.println("===== Keys =====");
        Set<String> keySet = eventYears.keySet();
        keySet.forEach((key) -> {
            System.out.println(key);
        });

        // Iterates Values
        System.out.println("===== Values =====");
        Collection<Integer> values = eventYears.values();
        values.forEach((value) -> {
            System.out.println(value);
        });
    }
}