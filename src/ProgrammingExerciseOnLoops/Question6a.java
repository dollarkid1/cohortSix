package ProgrammingExerciseOnLoops;

import java.util.Scanner;

/*Write a program that reads a set of integers, and then prints the sum of the even and odd integers*/

public class Question6a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a  positive number:");
        int number = input.nextInt();


        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < number; i++) {
            if(number % 2 == 0){
                sumOdd+=number;

                System.out.println(sumOdd);
            }
            else {
                sumEven+=number;

            }System.out.println(sumEven);
        }



       ;

    }
}
