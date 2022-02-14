package tutorial;

/**
 * @author William
 */
public class TestForLoop {
    public static void main(String[] args) {
        int[] numbers = { 11, 22, 33, 44, 55 };
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = { "Dave", "David", "Marty", "Nick" };
        for (String name : names) {
            System.out.println(name);
        }
    }
}
