package Chapter2Exercises;

import java.util.Scanner;

public class MethodNew_AgeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = input.nextInt();

        ageChecker (age);
    }

    static void ageChecker(int age){

        if(age < 18){
            System.out.println("Access denied- you are too young! ");
        }
        else{
            System.out.println("Access granted- you are old enough! ");
        }

    }

}

