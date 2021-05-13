package Chapter6_Methods;

import java.util.Scanner;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 numbers are prime numbers");
        printPrimeNumbers(50);

    }
      private static  Scanner input = new Scanner(System.in);
    private static void printPrimeNumbers(int numbersOfPrime) {
        final int NUMBERS_OF_PRIME_PER_LINE = 10;
        int count =0;
        int number = input.nextInt();

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
            for (int divisor = 2; divisor <= number ; divisor++) {
               if ( divisor % number == 0){
                   return false;
                }
            }
        return true;
    }

}
