package Chapter2Exercises;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER SECONDS:");
        int seconds = input.nextInt();
        int minutes = seconds/60;
//        int hours = minutes/60;
        int secondsRemaining = seconds % 60;
        System.out.println(seconds +" seconds" + " is "  + minutes + " minutes and " + secondsRemaining +" seconds" );
    }
}
