package Chapter2Exercises;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
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