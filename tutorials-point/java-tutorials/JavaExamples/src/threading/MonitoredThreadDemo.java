package threading;

/**
 * @author William
 */

// THREADING
public class MonitoredThreadDemo {
    private static void showThreadInfo(Thread thread) {
        // Data
        String name = thread.getName();
        boolean isAlive = thread.isAlive();
        Thread.State state = thread.getState();

        // Output
        System.out.printf("Thread name: %s \n", name);
        System.out.printf("Thread is alive: %s \n", isAlive ? "yes" : "no");
        System.out.printf("Thread state: %s \n", state);
    }

    public static void main(String[] args) throws Exception {
        final long DELAY = 50;

        // Start
        MonitoredThread thread = new MonitoredThread();
        thread.setName("My Thread #1");
        showThreadInfo(thread);
        thread.start();

        // Wait
        Thread.sleep(DELAY);
        showThreadInfo(thread);
        thread.setIsWaiting(false);

        // Notify
        Thread.sleep(DELAY);
        showThreadInfo(thread);
        thread.startNotify();

        // End
        Thread.sleep(DELAY);
        showThreadInfo(thread);
        while (thread.isAlive()) {
            System.out.println("alive...");
        }
        showThreadInfo(thread);
    }
}