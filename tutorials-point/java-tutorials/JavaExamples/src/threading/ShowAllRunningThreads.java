package threading;

/**
 * @author William
 */

// THREADING
public class ShowAllRunningThreads {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread();
        thread.setName("Thread #1");
        thread.start();

        // Data
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        int numberOfActiveThreads = group.activeCount();
        Thread[] lastThreads = new Thread[numberOfActiveThreads];
        group.enumerate(lastThreads);

        // Output
        for (Thread currentThread : lastThreads) {
            System.out.printf("Thread: %s \n", currentThread.getName());
        }
    }
}