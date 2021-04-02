package Chapter2Exercises;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("enter your score:");
        double score = i.nextDouble();
        if  (score >= 90.0){
        System.out.print("A");}
        else
         if (score >= 80.0)
            System.out.print("B");
        else if (score >= 70.0)
            System.out.print("C");
        else if (score >= 60.0)
            System.out.print("D");
        else
            System.out.print("F");
    }
}