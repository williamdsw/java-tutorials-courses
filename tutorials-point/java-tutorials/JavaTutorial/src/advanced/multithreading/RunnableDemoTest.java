package advanced.multithreading;

/**
 * @author William
 */

// MULTITHREADING
public class RunnableDemoTest {
    public static void main(String[] args) {
        RunnableDemo firstThread = new RunnableDemo("Thread 1");
        RunnableDemo secondThread = new RunnableDemo("Thread 2");
        firstThread.start();
        secondThread.start();
    }
}
