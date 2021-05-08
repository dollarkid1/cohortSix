package Chapter6_Methods;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("The first 50 numbers are prime numbers");
        printPrimeNumbers(50);

    }

    private static void printPrimeNumbers(int numbersOfPrime) {
        final int NUMBERS_OF_PRIME_PER_LINE = 10;
        int count =0;
        int number = 2;

        while (count <= numbersOfPrime){
            if (isPrime(number)){
                count++;
                if (count % NUMBERS_OF_PRIME_PER_LINE == 0){
                    System.out.printf("%-5s\n", number);
                }
                else
                    System.out.printf("%-5s", number);
            }

        }

        }
        public static boolean isPrime(int number){
            for (int i = 2; i <= number / 2; i++) {
               if ( i % number == 0){
                   return false;
                }
            }
        return true;
    }

}
