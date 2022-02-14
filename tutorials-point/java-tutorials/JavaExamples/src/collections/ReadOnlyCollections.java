package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author William
 */

// COLLECTIONS
public class ReadOnlyCollections {

    private static void readOnlyList() {
        try {
            List<String> list = new ArrayList<>();
            list = Collections.unmodifiableList(list);
            list.add("Something...");
        } catch (UnsupportedOperationException exception) {
            System.out.println("Cannot modify read-only list!");
        }
    }

    private static void readOnlySet() {
        try {
            Set<String> set = new HashSet<>();
            set = Collections.unmodifiableSet(set);
            set.add("Something...");
        } catch (UnsupportedOperationException exception) {
            System.out.println("Cannot modify read-only set!");
        }
    }

    private static void readOnlyMap() {
        try {
            Map<String, String> map = new HashMap<>();
            map = Collections.unmodifiableMap(map);
            map.put("0", "Something");
        } catch (UnsupportedOperationException exception) {
            System.out.println("Cannot modify read-only map!");
        }
    }

    public static void main(String[] args) {
        readOnlyList();
        readOnlySet();
        readOnlyMap();
    }
}