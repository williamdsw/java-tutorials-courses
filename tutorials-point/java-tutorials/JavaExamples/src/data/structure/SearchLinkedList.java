package data.structure;

import java.util.LinkedList;

/**
 * @author William
 */

// DATA STRUCTURES
public class SearchLinkedList {
    public static void main(String[] args) {
        // Data
        LinkedList<String> latestUclChampions = new LinkedList<>();
        latestUclChampions.add("Liverpool");
        latestUclChampions.add("Real Madrid");
        latestUclChampions.add("Real Madrid");
        latestUclChampions.add("Real Madrid");
        latestUclChampions.add("Barcelona");
        int firstIndex = latestUclChampions.indexOf("Real Madrid");
        int lastIndex = latestUclChampions.lastIndexOf("Real Madrid");

        // Output
        System.out.println(latestUclChampions);
        System.out.printf("First index of Real Madrid: %d \n", firstIndex);
        System.out.printf("Last index of Real Madrid: %d \n", lastIndex);
    }
}