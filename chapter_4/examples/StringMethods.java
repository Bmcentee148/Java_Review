/** Practice with simple built in String methods.

    @author Brian McEntee */

public class StringMethods {
    public static void main(String[] args) {
        String message = "Welcome to";
        System.out.println(message);
        System.out.println("The length of message is " + message.length());
        System.out.println("The first character in message is " 
            + message.charAt(0));
        System.out.println("The last character in message is " 
            + message.charAt(message.length() - 1));
        System.out.println(message.concat(" Java!")); //print Welcome to Java
        System.out.println(message); //print Welcome to
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println("   This had mad white space        ".trim());


        System.out.println(message.substring(message.length() - 1,message.length()));
    }
}