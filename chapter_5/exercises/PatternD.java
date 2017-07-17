public class PatternD {
    public static void main(String[] args ) {
        for (int i = 6; i >= 1; i--) {
            for (int k = 0; k < 6 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}