package data.structure;

import java.util.Collections;
import java.util.Vector;

/**
 * @author William
 */

// DATA STRUCTURES
public class VectorBinarySearch {
    public static void main(String[] args) {
        // Data
        Vector<String> libertadoresChampions = new Vector<>();
        libertadoresChampions.add("Flamengo");
        libertadoresChampions.add("River Plate");
        libertadoresChampions.add("Grêmio");
        libertadoresChampions.add("Atlético Nacional");
        libertadoresChampions.add("River Plate");
        Vector<String> sortedLibertadoresChampions = (Vector<String>) libertadoresChampions.clone();
        Collections.sort(sortedLibertadoresChampions);
        int indexOfGremio = Collections.binarySearch(sortedLibertadoresChampions, "Grêmio");

        // Output
        System.out.println(libertadoresChampions);
        System.out.println(sortedLibertadoresChampions);
        System.out.printf("Grêmio found at index %d \n", indexOfGremio);
    }
}