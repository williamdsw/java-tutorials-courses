package tutorial;

/**
 * @author William
 */
public class TestArrays {
    public static void main(String[] args) {
        System.out.println("Prices:");
        double[] prices = { 9.99, 2.35, 200.00, 1547.69, 34.66 };

        // Output
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        // Sum
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        System.out.println("Total: " + total);

        // Max
        double max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println("Maximum price: " + max);

        // Min
        double min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        System.out.println("Minimum price: " + min);
    }
}