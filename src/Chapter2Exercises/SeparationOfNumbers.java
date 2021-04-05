package Chapter2Exercises;

import java.util.Scanner;

public class SeparationOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number that have five digits");
        int number = in.nextInt();
        int firstNum, secondNum, thirdNum, fourthNum, fifthNum;

        firstNum= number/10000;
        secondNum = number%10000/1000;
        thirdNum = number%1000/100;
        fourthNum = number%100/10;
        fifthNum =  number%10;


        System.out.println(firstNum+ " "+secondNum+" "+thirdNum+" "+fourthNum+" "+fifthNum);
        System.out.println(fifthNum+ " "+fourthNum+" "+thirdNum+" "+secondNum+" "+firstNum);


    }
}
