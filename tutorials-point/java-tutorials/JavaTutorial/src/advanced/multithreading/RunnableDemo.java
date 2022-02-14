package advanced.multithreading;

/**
 * @author William
 */

// MULTITHREADING
public class RunnableDemo implements Runnable {

    private Thread thread;
    private String threadName;

    public RunnableDemo() {
    }

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.printf("Creating %s \n", this.threadName);
    }

    @Override
    public void run() {
        System.out.printf("Running %s \n", this.threadName);

        try {
            for (int i = 0; i < 4; i++) {
                System.out.printf("Thread: %s, %d \n", this.threadName, i);
                Thread.sleep(50);
            }
        } catch (InterruptedException exception) {
            System.out.printf("Thread %s interrupted. \n", this.threadName);
        }

        System.out.printf("Thread %s exiting \n", this.threadName);
    }

    // ------------------------------------------------------------------------//
    // HELPER FUNCTIONS

    public void start() {
        System.out.printf("Starting %s \n", this.threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}