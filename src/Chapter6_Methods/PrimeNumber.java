package Chapter6_Methods;

import java.util.Scanner;

public class PrimeNumber {
        private static final Scanner input = new Scanner(System.in);
    private static void isPrime(){
        int number = input.nextInt();

        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                break;
            }
            else
                System.out.println(number + "is a prime number");

    }

    public static void main(String[] args) {

            isPrime();


    }
}
