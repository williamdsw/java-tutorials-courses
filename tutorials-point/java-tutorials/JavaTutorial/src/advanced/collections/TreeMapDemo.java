package advanced.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author William
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        // Data
        Map teams = new TreeMap();
        teams.put("Real Madrid Club de Fútbol", 33);
        teams.put("FC Barcelona", 12);
        teams.put("Club Atlético de Madrid", 34);
        teams.put("Valencia Club de Fútbol", 72);

        // Output
        Set set = teams.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.printf(" %s - %s \n", entry.getKey(), entry.getValue());
        }
    }
}