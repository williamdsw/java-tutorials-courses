package methods;

/**
 * @author William
 */

// METHODS
public class TowersOfHanoiDemo {
    public static void move(int numberOfDisks, int startPole, int endPole) {
        // Cancels
        if (numberOfDisks == 0)
            return;

        int intermediatePole = (6 - startPole - endPole);
        move(numberOfDisks - 1, startPole, intermediatePole);

        // Output
        System.out.printf("Move %d from %d to %d \n", numberOfDisks, startPole, endPole);

        move(numberOfDisks - 1, intermediatePole, endPole);
    }

    public static void main(String[] args) {
        // Data
        int numberOfDisks = 5;
        int startPole = 1;
        int endPole = 4;
        move(numberOfDisks, startPole, endPole);
    }
}