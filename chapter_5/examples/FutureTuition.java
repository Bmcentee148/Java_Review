/** Find the doubling time for the cost of college tuition with a 7%/yr increase
    
    @author Brian McEntee */
    
public class FutureTuition {
    /** Main method */
    public static void main(String[] args) {
        final double INITIAL_COST = 10000;
        double rate = 1.07;
        int numYears = 0;

        double cost = INITIAL_COST;
        while (cost <= 20000) {
            cost *= rate;
            numYears++;
        }

        System.out.printf("The cost of tuition will double in %d years "
            + "and cost $%.2f dollars%n", numYears, cost);
    }
}