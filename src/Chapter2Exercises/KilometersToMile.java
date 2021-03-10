package Chapter2Exercises;

import java.util.Scanner;

public class KilometersToMile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter amount of KILOMETRES covered or press -1 to exit:");

        int miles = (int) (0.62137119 * input.nextInt());

        while(miles >= 1) {
            System.out.println("enter MINUTES taken:");

            double hour = (input.nextDouble() / 60);

            double averageSpeed = miles / hour;

            System.out.println("Average speed is " + averageSpeed + "mph");

            System.out.println();
            System.out.println("enter amount of KILOMETRES covered or press -1 to exit:");

            miles = (int) (0.62137119 * input.nextInt());
        }
    }
}