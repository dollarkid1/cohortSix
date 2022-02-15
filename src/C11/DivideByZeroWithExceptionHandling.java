package C11;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException, InputMismatchException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try
            {
                System.out.println("Pls enter an integer numerator");
                int numerator = scanner.nextInt();
                System.out.println("Pls enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            }
            catch (InputMismatchException mismatchException)
            {
                System.out.printf("%nException: %s%n", mismatchException);
                scanner.nextLine();
                System.out.printf("You must enter integers. Pls try again. %n%n");
            }
            catch (ArithmeticException arithmeticException)
            {
                System.out.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }
        }while (continueLoop);
    }
}
