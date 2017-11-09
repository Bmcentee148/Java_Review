/** Convert a given hexadecimal number into its decimal equivalent

    @author Brian McEntee
    @version 0.0 */

import java.util.Scanner;

public class HexToDecimal {
    /** Converts a single hexadecimal digit into its decimal equivalent

        @param hexChar the hex digit to convert to decimal (0 - 9 or A - F)
        @return the decimal number that represents the hex digit (0 - 15) */
    public static int hexCharToDecimal(char hexChar) {
        int decValue = 0;
        if (('A' <= hexChar && hexChar <= 'F') ||
            ('a' <= hexChar && hexChar <= 'f')) {
            decValue = Character.toUpperCase(hexChar) - 'A' + 10;
        }
        else if (Character.isDigit(hexChar)) {
            decValue = hexChar - '0';
        }
        else {
            throw new IllegalArgumentException(
                hexChar + " is not a valid hexadecimal character");
        }
        return decValue;
    } // end hexCharToDecimal

    /** Converts a hexadecimal number into its decimal equivalent

        @param hex the hexadecimal number to convert to decimal
        @return the decimal number that represents the hex number */
    public static int hexStringToDecimal(String hex) {
        if (hex.length() == 0) 
            throw new IllegalArgumentException("No hexadecimal number given");
        // Use Horner's algorithm to make the conversion
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            decimalValue = decimalValue * 16 + hexCharToDecimal(hex.charAt(i));
        }
        return decimalValue;
    } // end hexStringToDecimal

    /** Main method (currently for testing method implementations) */
    public static void main(String[] args) {

        //---------------------------Testing------------------------------------
        char ch1 = 'a';
        char ch2 = '0';
        char ch3 = '9';
        char ch4 = 'F';
        char ch5 = 'Z'; // invalid input

        System.out.println("'a' is " + hexCharToDecimal(ch1));
        System.out.println("'0' is " + hexCharToDecimal(ch2));
        System.out.println("'9' is " + hexCharToDecimal(ch3));
        System.out.println("'F' is " + hexCharToDecimal(ch4));
        //System.out.println("'Z' is " + hexCharToDecimal(ch5));

        String hex1 = "0";
        String hex2 = "F";
        String hex3 = "50";
        String hex4 = "addf";
        String hex5 = "24df56a";

        System.out.println(hexStringToDecimal(hex1));
        System.out.println(hexStringToDecimal(hex2));
        System.out.println(hexStringToDecimal(hex3));
        System.out.println(hexStringToDecimal(hex4));
        System.out.println(hexStringToDecimal(hex5));
    } // end main 
} // end HexToDecimal