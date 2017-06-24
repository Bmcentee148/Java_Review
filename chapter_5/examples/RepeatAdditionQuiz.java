import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        //Generate 2 random numbers
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        System.out.printf("What is %d + %d?%n", num1, num2);
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
    
        while (num1 + num2 != answer) {
            System.out.println("Wrong answer, try again.");
            System.out.printf("What is %d + %d?%n", num1, num2);
            answer = input.nextInt();
        }

        System.out.println("You got it!");
    }   
}