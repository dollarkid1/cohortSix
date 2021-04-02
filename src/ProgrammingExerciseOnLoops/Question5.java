package ProgrammingExerciseOnLoops;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int power;
        int base;
        int result = 1;
        System.out.println("enter  a positive integer Base:");
        base = input.nextInt();
        System.out.println("enter  a positive integer Power:");
        power = input.nextInt();
        for (int j = 0; j < power; j++) {
            result*=base;
        }
        System.out.println(result);


    }

}
