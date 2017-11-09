public class PrimeNumberMethod {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int divisor = 2; divisor <= n / 2; divisor++) {
            if (n % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void printPrimeNumbers(int numberOfPrimes) {
        int primeCount = 0;
        int num = 2;
        while (primeCount < numberOfPrimes) {
            if (isPrime(num)) {
                System.out.printf("%-5s", num);
                primeCount++;
                if (primeCount % 10 == 0)
                    System.out.println();
            }
            num++;
        }
    }
}