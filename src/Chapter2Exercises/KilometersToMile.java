package Chapter2Exercises;

import java.util.Scanner;

public class KilometersToMile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("enter amount of KILOMETRES covered:");

            int miles = (int) (0.62137119 * input.nextInt());

            System.out.println("enter MINUTES taken:");

            double hour = (input.nextDouble() / 60);

            double averageSpeed = miles / hour;

            System.out.println("Average speed is " + averageSpeed + "mph");

            System.out.println();
        }
    }
}