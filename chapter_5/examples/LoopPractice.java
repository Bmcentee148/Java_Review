public class LoopPractice {
    public static void main(String[] agrs) {

        int sum1 = 0;
        for (int i = 0; i <= 1000; i++) {
            sum1 += i;
        }

        int sum2 = 0;
        int index2 = 0;
        while (index2 <= 1000) {
            sum2 += index2;
            index2++;
        }

        int sum3 = 0;
        int index3 = 0;
        do {
            sum3 += index3;
            index3++;
        } while (index3 <= 1000);

    }
}