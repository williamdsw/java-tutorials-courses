package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author William
 */

// COLLECTIONS
public class ReverseCollection {
    public static void main(String[] args) {
        // Data
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Flamengo", "River Plate", "Grêmio", "Atlético Nacional"));
        List<String> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);

        // Output
        System.out.println(list);
        System.out.println(reversed);
    }
}