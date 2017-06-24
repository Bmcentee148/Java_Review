import java.util.Scanner;

public class Palindrome {
    /** Main method */
    public static void main(String[] args) {
        // Prompt user to enter a single word or number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or number: ");
        String str = input.nextLine().trim();

        // Check if the string is a palindrome
        int frontIndex = 0, backIndex = str.length() - 1;
        boolean isPalindrome = true;
        while (frontIndex < backIndex) {
            if (str.charAt(frontIndex) != str.charAt(backIndex)) {
                isPalindrome = false;
                break;
            }
            frontIndex++;
            backIndex--;
        }

        System.out.println(str + (isPalindrome ? " is " : " is not ")
            + "a palindrome");
    }
}