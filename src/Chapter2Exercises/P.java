package Chapter2Exercises;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
         int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        // Create a Scanner
         Scanner input = new Scanner(System.in);

         System.out.print(
              "What is " + number1 + " + " + number2 + "? ");

        int number = input.nextInt();
       int answer = number1 + number2;
     System.out.println(
              number1 + " + " + number2 + " = " + answer + " is " +
                        (number1 + number2 == answer));
    }
}
