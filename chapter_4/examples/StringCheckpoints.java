/** Solutions to checkpoints for Strings in Chapter 4

    @author Brian McEntee */

public class StringCheckpoints {
    public static void main(String[] args) {
        String s1 = " Welcome ";
        String s2 = " welcome ";

        boolean isEqual = s1.equals(s2);
        isEqual = s1.equalsIgnoreCase(s2);
        int x = s1.compareTo(s2);
        x = s1.compareToIgnoreCase(s2);
        boolean b = s1.startsWith("AAA");
        b = s1.endsWith("AAA");
        x = s1.length();
        char c = s1.charAt(0);
        String s3 = s1 + s2;
        s1.substring(1);
        s1.substring(1,5);
        s3 = s1.toLowerCase();
        s3 = s1.toUpperCase();
        s3 = s1.trim();
        int y = s1.indexOf('e');
        int z= s1.lastIndexOf("abc");
    }
}