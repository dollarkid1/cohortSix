package Chapter6_Methods;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinToss {
        private static final Scanner input = new Scanner(System.in);
    private static void coin() {
        System.out.println("COIN TOSS");
        System.out.println("""
                Press 1 for  HEAD
                Press 2 for  TAIL
                """);
        SecureRandom random = new SecureRandom();
        int toss = random.nextInt(2);
        int userInput = input.nextInt();
     if (userInput == 1 || userInput == 2){
         switch (userInput){
             case 1:
                 if (toss == 1 && userInput == toss) {
                     System.out.println("HEAD wins");
                 }
                 break;
             case 2:
                 if (toss == 0 && userInput == toss) {
                     System.out.println("TAIL wins");
                 }
                 break;
             default: if (userInput < 1 && userInput > 2) {
                 throw new IllegalArgumentException("invalid input");
             }
         }
     }


    }

    public static void main(String[] args) {
        coin();
    }

}

