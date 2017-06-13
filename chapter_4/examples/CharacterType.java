/** Practice using the char primitive data type.

    @author Brian McEntee */

public class CharacterType {
    public static void main(String[] args) {

        char letter = 'a';
        char numChar = '4';
        System.out.println(letter);
        System.out.println(numChar);

        letter = 'A';
        char unicodeLetter = '\u0041'; //unicode for 'A'
        System.out.println(unicodeLetter);
        System.out.println(unicodeLetter == letter);

        System.out.println("He said \"Java is fun\""); //escape char
        System.out.println("This\tThat");

        byte b = (byte)'\uFFF4'; //explicit cast necessary
        System.out.println(b);
        int i = 'A'; //implicit cast
        System.out.println(i);

        char ch1 = (char)0XAB0041; //only lower 16 bits assigned to ch1
        char ch2 = 0X0041;
        System.out.println(ch1 + "\t" + ch2);
        System.out.println(ch1 == ch2);
        char ch3 = (char)65.33; //first cast to int, then char
        System.out.println(ch3);
        int ch4 = (int)'A';
        System.out.println(ch4); //65

    }
}