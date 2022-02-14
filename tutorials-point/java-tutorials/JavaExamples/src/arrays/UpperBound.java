package arrays;

/**
 * @author William
 */

// ARRAYS
public class UpperBound {
    public static void main(String[] args) {
        // Data
        String[][] data = new String[3][10];
        int rowDimension = data.length;
        int colDimension = data[0].length;

        // Output
        System.out.printf("Upper bound of row : %d \n", rowDimension);
        System.out.printf("Upper bound of col : %d \n", colDimension);
    }
}