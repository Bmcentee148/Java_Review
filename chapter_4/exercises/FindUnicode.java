/** Given a single character find its corresponding unicode value 
    
    @author Brian McEntee */

import java.util.Scanner;

public class FindUnicode {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char ch = input.nextLine().charAt(0);
        System.out.printf("The Unicode for the character %c is %d%n", ch, 
            (int)ch);
    }
}