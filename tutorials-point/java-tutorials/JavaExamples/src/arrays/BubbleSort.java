package arrays;

/**
 * @author William
 */

// ARRAYS
public class BubbleSort {

    private static void bubbleSort(int[] array) {
        int length = array.length;
        int current = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= (length - 1); j++) {
                if (array[j - 1] > array[j]) {
                    current = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = current;
                }
            }
        }
    }

    private static void printArray(String message, int[] array) {
        System.out.printf("%s : \n", message);
        for (int index = 0; index < array.length; index++) {
            String sepatator = (index != array.length - 1 ? "," : "");
            System.out.printf("%d%s ", array[index], sepatator);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Data
        int[] numbers = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int[] bubbleNumbers = numbers.clone();
        bubbleSort(bubbleNumbers);

        // Output
        printArray("Original Array", numbers);
        printArray("Array after Bubble Sort", bubbleNumbers);
    }
}