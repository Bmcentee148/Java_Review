/** Find the future cost of tuition (10 yrs) and total cost for 4 yrs after that

    @author Brian McEntee */

public class Exercise05_07 {
    /** Main method */
    public static void main(String[] args) {
        final double INITIAL_COST = 10000.00; //initial cost of tuition per year
        final double RATE_OF_INCREASE = .05; //percent increase of cost per year

        // Find cost of tuition for 10 years from now
        double futureCost = INITIAL_COST;
        for (int year = 1; year <= 10; year++) {
            futureCost *= 1 + RATE_OF_INCREASE;
        }
        System.out.printf("The cost 10 years from now would be $%.2f%n",
            futureCost);

        // Find total cost of 4 years worth of tuition after the 10th year
        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            futureCost *= 1 + RATE_OF_INCREASE;
            totalCost += futureCost;
        }
        System.out.printf("The total cost of 4 years tuition would be $%.2f%n",
            totalCost);
    }
}