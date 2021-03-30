package ChapterFive;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {

        int answer = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.println("guess a magic number between 0 - 100");


        int guessNumber = -1;

        while(guessNumber !=answer) {
            System.out.print("\nenter your guess:");
             guessNumber = input.nextInt();

            if (guessNumber == answer)
                System.out.println("Yes, the answer is " + answer);

            else if (guessNumber < answer)
                System.out.println("the answer is too low");

            else
                System.out.println("the answer is too high");
        }
    }
}
