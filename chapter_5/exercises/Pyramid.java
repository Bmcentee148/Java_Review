import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        // Prompt user to enter number for pyramid and ensure input is valid
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer 1 - 15: ");
        int maxNumber = input.nextInt();
        while (maxNumber < 1 || maxNumber > 15) {
            System.out.print("Integer not in valid range, enter another: ");
            maxNumber = input.nextInt();
        }

        for(int row = 1; row <= maxNumber; row++) {
            for(int num = maxNumber; num > 1; num--) {
                if (num <= row) {
                    System.out.print(num + " ");
                }
                else if (num > 9) { //need 3 spaces
                    System.out.print("   ");
                }
                else { //need 2 spaces
                    System.out.print("  ");
                }
            }
            for(int num = 1; num <= maxNumber; num++) {
                if (num <= row) {
                    System.out.print(num + " ");
                }
                else if (num > 9) { //need 3 spaces
                    System.out.print("   ");
                }
                else { //need 2 spaces
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}