package ChapterFive;

import java.util.Scanner;

public class WhileLoop_Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOne = (int)(Math.random()* 10);
        int numberTwo = (int)(Math.random()* 10);
        int answer = numberOne + numberTwo;
        System.out.println("what is "+ numberOne  + " + " + numberTwo +"=?");
        int userInput = in.nextInt();

        while(answer != userInput){
            System.out.println("wrong answer! \nTry Again " + "what is "+ numberOne  + " + " + numberTwo+"=?");
            userInput = in.nextInt();
        }
        System.out.println("Correct");
    }
}
