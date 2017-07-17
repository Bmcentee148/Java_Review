/** Find sales amount necessary to make desired salary with commissions

    @author Brian McEntee */

public class Exercise05_39 {
    /** Main method */
    public static void main(String[] args) {
        final double BASE_SALARY = 5000;
        final double TOTAL_DESIRED_SALARY = 30000;
        final double COMMISSION_SOUGHT = TOTAL_DESIRED_SALARY - BASE_SALARY;

        int salesAmount = 0;
        double commissionEarned = 0;
        while (commissionEarned < COMMISSION_SOUGHT) {
            salesAmount++;
            commissionEarned = 0;
            if(salesAmount <= 5000) {
                commissionEarned += salesAmount * .08;
            }
            else if (salesAmount > 5000 && salesAmount <= 10000) {
                commissionEarned += 5000 * .08;
                commissionEarned += (salesAmount - 5000) * .10;
            }
            else {
                commissionEarned += 5000 * .08;
                commissionEarned += 5000 * .10;
                commissionEarned += (salesAmount - 10000) * .12;
            }
        }
        System.out.printf("It will take a minimum of $%.2f in sales in order "
            + "to make a total of $%.2f in a year with commission.%n",
            (double)salesAmount, BASE_SALARY + commissionEarned);
    }
}