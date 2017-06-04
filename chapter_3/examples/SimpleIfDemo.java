import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = kb.nextInt();

        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }
    }
}