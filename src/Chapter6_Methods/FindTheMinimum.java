package Chapter6_Methods;

import java.util.Scanner;

public class FindTheMinimum {
    private static Scanner input = new Scanner(System.in);
    private static float min(float number1, float number2, float number3){
        float result = Math.min(Math.min(number1, number2), number3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        float number1 = input.nextFloat();
        System.out.println("Enter second number: ");
        float number2 = input.nextFloat();
        System.out.println("Enter third number: ");
        float number3 = input.nextFloat();
        System.out.println();
        System.out.println("the Minimum is " + min(number1,number2,number3));
    }
}
