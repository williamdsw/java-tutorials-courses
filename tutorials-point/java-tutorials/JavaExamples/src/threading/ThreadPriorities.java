package threading;

/**
 * @author William
 */

// THREADING
public class ThreadPriorities extends Thread {

    private int countdown = 5;
    private volatile double result = 0;
    private final int NUMBER_OF_OCCURRENCES = 100000;

    public ThreadPriorities(int priority) {
        this.setPriority(priority);
        this.start();
    }

    @Override
    public String toString() {
        return String.format("%s : %s", super.toString(), countdown);
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < NUMBER_OF_OCCURRENCES; i++) {
                result += (Math.PI + Math.E) / (double) i;
            }

            System.out.println(this);

            if (--countdown == 0)
                return;
        }
    }
}