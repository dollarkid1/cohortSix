package ChapterFour;

import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int guess = 17;
        int userGuess = 0;


        while (guess != userGuess) {

            System.out.print("Enter guess number: ");
            userGuess = input.nextInt();

            if (guess == userGuess)
                System.out.println("correct answer");

            else if (guess > userGuess) {
                System.out.println("wrong try again");
                System.out.println("the answer is higher");
            }
            if (guess < userGuess) {
                System.out.println("wrong try again");
                System.out.println("the answer is lower");



            }

        }
    }
}