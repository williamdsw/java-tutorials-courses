package threading;

/**
 * @author William
 */

// THREADING
public class CheckThreadStop {
    public static void main(String[] args) throws Exception {
        // Start
        Thread thread = new MyThread();
        thread.start();
        boolean isAlive = thread.isAlive();
        System.out.printf("Thread %s finished! \n", isAlive ? "is" : "is not");

        // Delay
        long delay = 5000;
        thread.join(delay);
        isAlive = thread.isAlive();
        System.out.printf("Thread %s finished! \n", isAlive ? "is" : "is not");
    }
}