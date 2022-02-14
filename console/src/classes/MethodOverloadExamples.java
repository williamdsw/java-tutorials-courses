package classes;

/**
 * @author William
 */
public class MethodOverloadExamples {
    public static void main(String[] args) {
        // Examples
        System.out.printf("First sum: %s \n", Calculation.sum(10, 10));
        System.out.printf("Second sum: %s \n", Calculation.sum(10, 10, 10));
        System.out.printf("Third sum: %s \n", Calculation.sum(10.5f, 10.5f));
        System.out.printf("Fourth sum: %s \n", Calculation.sum(10.5f, 10.5f, 10.5f));
    }
}