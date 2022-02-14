package advanced;

/**
 * @author William
 */
public class ThreadExample {
    public static void main(String[] args) {
        testAccountClass();
    }

    private static void testAccountClass() {
        try {
            Account account = new Account();
            account.setBalance(100.00);

            System.out.println("First account balance: " + account.getBalance());

            // Runnables
            Runnable deposit = () -> {
                account.deposit(1000.00);
                System.out.println("Account balance after deposit: " + account.getBalance());
            };

            Runnable update = () -> {
                account.update(1);
                System.out.println("Account balance after update: " + account.getBalance());
            };

            // Threads
            Thread depositThread = new Thread(deposit);
            Thread updateThread = new Thread(update);
            depositThread.start();
            updateThread.start();
            depositThread.join();
            updateThread.join();

            System.out.println("Final account balance: " + account.getBalance());
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}