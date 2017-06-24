/** Display the first 50 prime numbers in 5 lines containing 10 numbers each

    @author Brian McEntee */

public class PrimeNumbers {
    public static void main(String[] args) {
        final int NUM_PRIMES = 50;
        int count = 0;
        int number = 1;

        while (count < NUM_PRIMES) {
            // Determine if number is prime
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if(number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++; 
                System.out.printf("%4d", number);
                if (count % 5 == 0) {
                    System.out.println(); // add new line every 5 primes
                }
            }

            number++;
        }
    }
}