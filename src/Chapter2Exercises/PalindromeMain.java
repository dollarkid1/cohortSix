package Chapter2Exercises;

import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("enter a number to check Palindrome:");
        int toni = input.nextInt();
        int firstNumber = toni/ 10;
        int secondNumber = toni% 10;
        if(firstNumber==secondNumber){
            System.out.println("its a Palindrome");
        }
        else {
            System.out.println("not a Palindrome");
        }
    }
}
