package ChapterFour;

import java.util.Scanner;

public class Factor {
    public static void findFactor(int a) {
        for(int num=1; num <= a; num++) {
            if(a % num == 0)
                System.out.print(num+"  ");
        }
    }

    public static void main(String[] args) {
        int number ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        System.out.print("The factors are: ");
        findFactor(number);
    }


}
