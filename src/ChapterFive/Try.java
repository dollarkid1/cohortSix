package ChapterFive;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, sum = 0, i;
        for (i = 0; i < 5; i++) {
            number = input.nextInt();
            sum += number;
        }
        System.out.println("sum is " + sum);
        System.out.println("count is " + i);
    }
}