public class ShowLogicErrors {
    public static void main(String[] agrs) {
        //This is a logic error since 9 / 5 is truncated to 1 here
        System.out.print("Celcius 35 is Farenheit degree ");
        System.out.println((9 / 5) * 35 + 32);
    }
}