package ChapterFive;

import java.util.Scanner;

public class Looping5SubtractionQuestion {
    public static void main(String[] args) {

        final int NUMBER_OF_QUESTIONS = 5;
        int correctAnswer = 0;
        int count = 0;
        String output = " ";
        long startTime = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);
        System.out.println("answer all 5 question");


        while(count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if(number1 < number2){
                int swap = number1;
                number1 = number2;
                 number2 = swap;
            }
            System.out.println();
            System.out.println("What is " + number1  + " - " + number2 + " = ?");
            int answer = input.nextInt();

            if(number1 - number2 ==answer){
                System.out.println("Yes, you got it\n" + number1  + " - " + number2
                        + " is equal to " + (number1 - number2));
                correctAnswer++;
            }
            else
                System.out.println("The answer is wrong \n"+ number1  + " - " + number2
                        + " is equal to " + (number1 - number2));
            count++;

            output +="\n" + number1 + "-" + number2 + "=" + answer +
                     ((number1 - number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long checkTime = startTime-endTime;

        System.out.println("Correct count is " + correctAnswer +
                 "\nTest time is " + checkTime / 1000 + " seconds\n" + output);
    }
}
