package threading;

/**
 * @author William
 */

// THREADING
public class MyThread extends Thread {
    private boolean stop = false;

    @Override
    public void run() {
        while (true) {
            if (stop)
                break;
        }
    }
}