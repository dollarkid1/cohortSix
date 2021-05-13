package ChapterFive;

import java.util.Scanner;

public class ModifiedDiamondPrinting {

    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter an odd number from 1-19 to print a Star ");
        int lines = input.nextInt();
            if (lines <= 19 && lines % 2 == 1 ){


        int spaces =20 ;
        int stars = 1;

        int div = lines/2;

        for (int i = 0; i <= lines; i++) {

            for (int a = spaces; a > 0; a--) {
                System.out.print(" ");
            }
            for (int b = stars; b > 0; b--) {
                System.out.print("* ");
            }
            System.out.println();

            if (i < div){
                spaces -=2; stars+=2;
            }
            else if (i >= div){
                spaces +=2; stars -=2;
            }

        }
            }
            else{
                System.out.println("input out of range!!!");
            }
    }




}
