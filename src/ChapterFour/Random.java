package ChapterFour;

import java.util.Scanner;

public class Random {


    public static void main(String[] args) {


        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;

        int i=0;
        while(i < 10){


            int x = (int) (Math.random() * 100);

            int y = (int) (Math.random() * 100);

            int questionRandom = (int) (1 + (Math.random() * 4));

            Scanner input = new Scanner(System.in);

            int result;

            switch (questionRandom) {
                case 1 -> {
                    System.out.println(x + " + " + y + " = ?");
                    System.out.println("enter your answer:");
                    int userInput1 = input.nextInt();
                    int sum = x + y;
                    result = (sum == userInput1) ? correctAnswerCount++ : wrongAnswerCount++;

                    System.out.println();
                }
                case 2 -> {
                    System.out.println(x + " - " + y + " = ?");
                    System.out.println("enter your answer:");
                    int userInput2 = input.nextInt();
                    int subtract = x - y;
                    result = (subtract == userInput2) ? correctAnswerCount++ : wrongAnswerCount++;
                    System.out.println();
                }
                case 3 -> {
                    System.out.println(x + " / " + y + " = ?");
                    System.out.println("enter your answer:");
                    int userInput3 = input.nextInt();
                    double division = x / y;
                    result = (division == userInput3) ? correctAnswerCount++ : wrongAnswerCount++;
                    System.out.println();
                }
                case 4 -> {
                    System.out.println(x + " * " + y + " = ?");
                    System.out.println("enter your answer");
                    int userInput4 = input.nextInt();
                    int multiply = x * y;
                    result = (multiply == userInput4) ? correctAnswerCount++ : wrongAnswerCount++;
                    System.out.println();
                }
            }

            i++;
        }
        System.out.println("you scored " + correctAnswerCount + " /" +(correctAnswerCount++ + wrongAnswerCount++));
        System.out.println("thank you for taking the exam");


    }
}
