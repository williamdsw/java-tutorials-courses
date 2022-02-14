package threading;

/**
 * @author William
 */

// THREADING
public class ThreadPrioritiesDemo {
    public static void main(String[] args) throws Exception {
        ThreadPriorities firstThread = new ThreadPriorities(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++) {
            ThreadPriorities secondThread = new ThreadPriorities(Thread.MIN_PRIORITY);
        }
    }
}