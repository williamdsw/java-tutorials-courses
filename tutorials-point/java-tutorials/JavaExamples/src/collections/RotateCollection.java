package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author William
 */

// COLLECTIONS
public class RotateCollection {
    public static void main(String[] args) {
        // Data
        List<String> list = Arrays.asList("Flamengo", "River Plate", "Grêmio", "Atlético Nacional", "San Lorenzo",
                "Atlético Mineiro");
        List<String> rotated = new ArrayList<>(list);
        int desiredIndex = 2;
        Collections.rotate(rotated, desiredIndex);

        // Output
        System.out.println(list);
        System.out.println(rotated);
    }
}