package ProgrammingExerciseOnLoops;

/*Write a program to find the factorial value of any number entered through the keyboard.*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a positive integer for factorial:");
        int num = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }System.out.println(fact);
    }
}
