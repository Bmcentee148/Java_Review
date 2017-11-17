/**
* This program will randomly generate 100 characters, store them in an array,
* and then determine the frequency each character occurs.
* @author Brian McEntee
*/
public class CountLettersInArray {
    /** Main method. */
    public static void main(String[] args) {
        char[] letters = createLetterArray(100);
        int[] freqs = getLetterFrequencies(letters);
        System.out.println("The lowercase letters are: ");
        printCharArray(letters);
        System.out.println("The occurrences of each letter are: ");
        printCharFrequencies(freqs);
    }

    /** Generate an array of random lower case character with given size. */
    public static char[] createLetterArray(int size) {
        char[] randLetters = new char[size];
        for (int i = 0; i < size; i++) {
            randLetters[i] = getRandomLowerCase();
        }
        return randLetters;
    }

    /** Count the frequency of each character in the given array. */
    public static int[] getLetterFrequencies(char[] letters) {
        int[] letterFreqs = new int[26];

        for (int i = 0; i < letters.length; i++) {
            letterFreqs[letters[i] - 'a']++;
        }
        return letterFreqs;
    }

    /** Generate a random lower case character. */
    public static char getRandomLowerCase() {
        return (char)('a' + Math.random() * ('z' - 'a' + 1));
    }

    /** Print a char array to console with 20 characters per line. */
    public static void printCharArray(char[] letters) {
        int numPrinted = 0;
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
            numPrinted++;
            if (numPrinted % 20 == 0) {
                System.out.println();
            }
        }
    }

    /** Print the frequencies for each character with 10 per line. */
    public static void printCharFrequencies(int[] freqs) {
        int numPrinted = 0;
        for (int i = 0; i < freqs.length; i++) {
            System.out.print((char)(i + 'a') + " " + freqs[i] + " ");
            numPrinted++;
            if (numPrinted % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}