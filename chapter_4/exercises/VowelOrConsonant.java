/** Determine whether a given character is a vowel or a consonant

    @author Brian McEntee */
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Enter a letter a - z: ");
        Scanner input = new Scanner(System.in);
        char ch = input.nextLine().charAt(0);
        char testChar = Character.toLowerCase(ch);
        if (testChar >= 'a' && testChar <= 'z') {
            boolean isVowel = false;
            if (   testChar == 'a'
                || testChar == 'e'
                || testChar == 'i'
                || testChar == 'o'
                || testChar == 'u') {
                isVowel = true;
            }
            System.out.printf("%c is a %s%n",
                ch, isVowel ? "vowel" : "consonant");
        }
        else {
            System.out.printf("%c is an invalid input%n", ch);
        }
    }
}