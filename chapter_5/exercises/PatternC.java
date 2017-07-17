public class PatternC {
    public static void main(String[] args) {
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for(int j = 6; j >= 1; j--) {
                if (j > i) {
                    System.out.print("  ");
                }
                else { 
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}