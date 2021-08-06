package ChapterFour;
import java.util.Scanner;
public class Tv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("enter number:");

        number1 = input.nextInt();

        System.out.print("enter number:");

        number2 = input.nextInt();

        if(number1 == number2){
            System.out.print("Palindrome");
        }

        if(number2 == number1){
            System.out.print(" ");
        }
        else
//            if(number2 != number1 || number1 != number2)
                System.out.println(" not a Palindrome!");



    }
}



