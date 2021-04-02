package ProgrammingExerciseOnLoops;
/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
 For example, if the input is 12345, the output should be 54321*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = input.nextInt();

        int temp = number;
        int remainder = 0;

        while(temp>0)
        {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }
}
//