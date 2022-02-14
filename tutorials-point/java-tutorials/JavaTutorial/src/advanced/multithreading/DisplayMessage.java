package advanced.multithreading;

/**
 * @author William
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage() {
    }

    public DisplayMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}