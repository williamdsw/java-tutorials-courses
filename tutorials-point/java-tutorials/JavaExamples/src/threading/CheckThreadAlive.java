package threading;

/**
 * @author William
 */

// THREADING
public class CheckThreadAlive {
    public static void main(String[] args) {
        // Data
        AliveThread aliveThread = new AliveThread();
        aliveThread.setName("Thread");
        boolean isAlive = aliveThread.isAlive();
        System.out.printf("Is thread alive before start() ? %s \n", isAlive ? "Yes" : "No");

        // Start
        aliveThread.start();
        isAlive = aliveThread.isAlive();
        System.out.printf("Is thread alive after start() ? %s \n", isAlive ? "Yes" : "No");

        for (int i = 0; i < aliveThread.getNumberOfOcurrences(); i++) {
            aliveThread.showMessage();
        }

        isAlive = aliveThread.isAlive();
        System.out.printf("Is thread alive in end of main ? %s \n", isAlive ? "Yes" : "No");
    }
}