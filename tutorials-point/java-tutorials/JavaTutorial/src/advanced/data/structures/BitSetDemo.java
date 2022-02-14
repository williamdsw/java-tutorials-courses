package advanced.data.structures;

import java.util.BitSet;

/**
 * @author William
 */
public class BitSetDemo {
    public static void main(String[] args) {
        final int INITIAL_SIZE = 16;
        BitSet bits1 = new BitSet(INITIAL_SIZE);
        BitSet bits2 = new BitSet(INITIAL_SIZE);

        // Fills
        for (int i = 0; i < INITIAL_SIZE; i++) {
            if ((i % 2) == 0) {
                bits1.set(i);
            }
            if ((i % 5) != 0) {
                bits2.set(i);
            }
        }

        // Output
        System.out.println(" Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\n Initial pattern in bits2: ");
        System.out.println(bits2);

        // AND
        bits2.and(bits1);
        System.out.println("\n bits2 AND bits1: ");
        System.out.println(bits2);

        // OR
        bits2.or(bits1);
        System.out.println("\n bits2 OR bits1: ");
        System.out.println(bits2);

        // XOR
        bits2.xor(bits1);
        System.out.println("\n bits2 XOR bits1: ");
        System.out.println(bits2);
    }
}