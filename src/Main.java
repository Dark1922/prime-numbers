import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int limit = 100;
        int sum = calculateSumOfPrimes(limit);
        logger.info("The sum of prime numbers up to " + limit + " is : " + sum);

        int number = 5; // You can change this value to calculate the factorial of a different number
        long factorial = calculateFactorial(number);
        logger.info("The factorial of " + number + " is: " + factorial);
    }

    public static int calculateSumOfPrimes(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}