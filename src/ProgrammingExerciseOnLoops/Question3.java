package ProgrammingExerciseOnLoops;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number number to multiply 1-12!");
        int a = in.nextInt();
        System.out.println("multiplication table created for "+a);
        int i = 0;
        while(i<13) {
            System.out.println(i +" x "+a+ "= "+(i*a));
            i++;
        }
    }
}
