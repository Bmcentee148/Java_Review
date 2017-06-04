public class ReverseString {
    public static void main(String[] args) {    

        String s = "Fubar";
        String reverse = "";
        int frontIndex = 0;
        int backIndex = s.length() - 1;
        while(frontIndex < s.length()) {
            reverse += String.valueOf(s.charAt(backIndex));
            frontIndex++;
            backIndex--;
        }

        System.out.println(reverse);
    }
}