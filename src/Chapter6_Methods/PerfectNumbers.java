package Chapter6_Methods;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        System.out.println("enter a number to check if it's perfect:");
        isPerfect();
    }


    private static final Scanner input = new Scanner(System.in);

    public static void isPerfect() {
        int userInput = input.nextInt();
        int sum = 0;
        for (int i = 1; i < userInput; i++) {
            sum += i;
            if (sum == userInput)break;
        }

        if (sum == userInput){
            System.out.println(userInput+" is a perfect number");

        }
        else
            System.out.println(userInput+" is not a perfect number");



    }
}