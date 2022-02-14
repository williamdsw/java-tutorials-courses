package methods;

/**
 * @author William
 */

// METHODS - OVERLOADING
public class ArrayPrinter {

    public void printArray(Integer[] array) {
        for (Integer element : array) {
            System.out.printf("%d ", element);
        }

        System.out.println();
    }

    public void printArray(Double[] array) {
        for (Double element : array) {
            System.out.printf("%f ", element);
        }

        System.out.println();
    }

    public void printArray(Character[] array) {
        for (Character element : array) {
            System.out.printf("%c ", element);
        }

        System.out.println();
    }

    public void printArray(String[] array) {
        for (String element : array) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }
}