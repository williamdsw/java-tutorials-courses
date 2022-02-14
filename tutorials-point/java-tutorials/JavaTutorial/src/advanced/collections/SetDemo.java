package advanced.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author William
 */
public class SetDemo {
    public static void main(String[] args) {
        final int NUMBER_OF_OCCURRENCES = 10;
        Set<Integer> integerSet = new HashSet<>();

        try {
            // Fills
            for (int i = 0; i < NUMBER_OF_OCCURRENCES; i++) {
                Random random = new Random();
                integerSet.add(random.nextInt(20));
            }

            System.out.println(integerSet);

            // TreeSet
            SortedSet treeSet = new TreeSet(integerSet);
            Integer firstInteger = (Integer) treeSet.first();
            Integer lastInteger = (Integer) treeSet.last();

            System.out.println(treeSet);
            System.out.printf(" First Integer : %d \n", firstInteger);
            System.out.printf(" Last Integer : %d \n", lastInteger);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}