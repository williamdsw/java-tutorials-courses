package advanced.documentation;

/**
 * <h1>Sum</h1>
 * <p>
 * The sum application simply sums many numbers that you want
 * </p>
 * 
 * @author William
 * @version 1.0
 * @since 2019-11-20
 */
public class Sum {
    /**
     * This method is used to sum many integers that you want
     * 
     * @param numbers This is the array of integers
     * @return int This returns the total
     */
    public int sum(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    /**
     * This method is used to sum many doubles that you want
     * 
     * @param numbers This is the array of doubles
     * @return double This returns the total
     */
    public double sum(double... numbers) {
        double total = 0.0;

        for (double number : numbers) {
            total += number;
        }

        return total;
    }
}