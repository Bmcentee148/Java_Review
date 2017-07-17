public class Exercise05_19 {
    /** Main method */
    public static void main (String[] args) {

        for (int line = 1; line <= 8; line++) {
            int numSpaces = 8 - line; //spaces for formatting pyramid
            for (int i = 0; i < numSpaces; i++) {
                System.out.print("    ");
            }
            for(int exp = 0; exp < line; exp++) {
                System.out.printf("%4d",(int)Math.pow(2,exp));
            }
            for (int exp = line - 2; exp >= 0; exp--) {
                System.out.printf("%4d", (int)Math.pow(2, exp));
            }
            System.out.println();
        }
    }
}