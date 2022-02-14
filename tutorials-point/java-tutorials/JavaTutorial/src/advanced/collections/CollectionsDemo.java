package advanced.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author William
 */
public class CollectionsDemo {
    private static void testArrayList() {
        List teams = new ArrayList();
        teams.add("Real Madrid Club de Fútbol");
        teams.add("FC Barcelona");
        teams.add("Club Atlético de Madrid");
        teams.add("Valencia Club de Fútbol");
        System.out.println("\n----- ARRAY LIST -----");
        System.out.println(teams);
    }

    private static void testLinkedList() {
        List teams = new LinkedList();
        teams.add("Real Madrid Club de Fútbol");
        teams.add("FC Barcelona");
        teams.add("Club Atlético de Madrid");
        teams.add("Valencia Club de Fútbol");
        System.out.println("\n----- LINKED LIST -----");
        System.out.println(teams);
    }

    private static void testHashSet() {
        Set teams = new HashSet();
        teams.add("Real Madrid Club de Fútbol");
        teams.add("FC Barcelona");
        teams.add("Club Atlético de Madrid");
        teams.add("Valencia Club de Fútbol");
        System.out.println("\n----- HASH SET -----");
        System.out.println(teams);
    }

    private static void testHashMap() {
        Map teams = new HashMap();
        teams.put("Real Madrid Club de Fútbol", 33);
        teams.put("FC Barcelona", 12);
        teams.put("Club Atlético de Madrid", 34);
        teams.put("Valencia Club de Fútbol", 72);
        System.out.println("\n----- HASH SET -----");
        System.out.println(teams);
    }

    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
        testHashSet();
        testHashMap();
    }
}