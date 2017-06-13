public class CharacterCheckpoints {
    public static void main(String[] args) {
        /* Checkpoint 4.8 */
        //find ASCII codes for specific characters
        System.out.println((int)'1');
        System.out.println((int)'A');
        System.out.println((int)'B');
        System.out.println((int)'a');
        System.out.println((int)'b');

        //find out the character for specific decimal codes
        System.out.println((char)40);
        System.out.println((char)59);
        System.out.println((char)79);
        System.out.println((char)85);
        System.out.println((char)90);

        //find out the character for specific hexadecimal codes
        System.out.println((char)0x40);
        System.out.println((char)0x5a);
        System.out.println((char)0x71);
        System.out.println((char)0x72);
        System.out.println((char)0x7a);

        /* Checkpoint 4.9 */
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int jSol = 49 + 50 * (52 - 51) + 1; //100
        System.out.println(jSol + ", " + (j == jSol));
        int k = 'a';
        char c = 'a';
        System.out.println(++k);

        /* Checkpoint 4.14 */
        //Generate a random lower case character
        char randomLowerCase = (char)(97 + (int)(Math.random() * (123 - 97)));
        System.out.println(randomLowerCase);
    }
}