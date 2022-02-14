package advanced.documentation;

/**
 * @author William
 */
public class SumDemo {
    public static void main(String[] args) {
        Sum sum = new Sum();
        int firstIntSum = sum.sum(10, 20);
        int secondIntSum = sum.sum(1, 33, 32, 46, 97);
        double firstDoubleSum = sum.sum(0.1, 4.5, 3.3);
        double secondDoubleSum = sum.sum(20.3, 22.1, 654.99, 1000.99);

        // Output
        System.out.printf("First integer sum: %d \n", firstIntSum);
        System.out.printf("Second integer sum: %d \n", secondIntSum);
        System.out.printf("First double sum: %f \n", firstDoubleSum);
        System.out.printf("Second double sum: %f \n", secondDoubleSum);
    }
}