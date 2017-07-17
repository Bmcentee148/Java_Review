/** Simulate flipping a coin one million times, show number of heads and tails

    @author Brian McEntee */

public class Exercise05_40 {
    /** Main method */
    public static void main(String[] args) {
        final int HEADS = 0;
        final int TAILS = 1;
        int numHeads = 0, numTails = 0;
        for (int i = 0; i < 1000000; i++) {
            int flipResult = (int)(Math.random() * 2);
            if (flipResult == HEADS)
                numHeads++;
            else if (flipResult == TAILS)
                numTails++;
        }
        System.out.printf("%-8s%-8s%n", "Heads", "Tails");
        System.out.printf("%-8d%-8d%n", numHeads, numTails);
    }
}