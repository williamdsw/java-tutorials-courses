package advanced.multithreading;

/**
 * @author William
 */

// MULTITHREADING
public class ThreadDemoTest {
    public static void main(String[] args) {
        Thread firstThread = new ThreadDemo("Thread 1");
        Thread secondThread = new ThreadDemo("Thread 2");
        firstThread.start();
        secondThread.start();
    }
}
