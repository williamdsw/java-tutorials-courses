package advanced.multithreading;

/**
 * @author William
 */
public class ThreadClassDemo {
    public static void main(String[] args) {
        // First Thread
        System.out.println("Starting Hello Thread...");
        Runnable helloRunnable = new DisplayMessage("Hello!");
        Thread helloThread = new Thread(helloRunnable);
        helloThread.setDaemon(true);
        helloThread.setName("Hello");
        helloThread.start();

        // Second Thread
        System.out.println("Starting Goodbye Thread...");
        Runnable goodbyeThread = new DisplayMessage("Goodbye!");
        Thread goodbyeThreas = new Thread(goodbyeThread);
        goodbyeThreas.setPriority(Thread.MIN_PRIORITY);
        goodbyeThreas.setDaemon(true);
        goodbyeThreas.setName("Goodbye");
        goodbyeThreas.start();

        // Third Thread
        System.out.println("Starting Third Thread...");
        Thread guessThread = new GuessNumber(99);
        guessThread.start();

        try {
            guessThread.join();
        } catch (InterruptedException exception) {
            System.out.println("Third Thread Interrupted");
        }

        // Fourth Thread
        System.out.println("Starting Fourth Thread...");
        Thread otherThread = new GuessNumber(42);
        otherThread.start();
    }
}