public class TestBreakV2 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        while (num < 20) {
            sum += ++num;
            if (sum >= 100) break;
        }

        System.out.printf("Number: %d%nSum: %d%n", num, sum);
    }
}