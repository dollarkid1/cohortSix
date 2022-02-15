package Chapter6_Methods;

import java.util.Scanner;

public class ParkingCharges {

    private final static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        calculateCharges();
    }

    private static void calculateCharges() {

        System.out.println("How many hours have been parked e.g = 1" );
        int  input = scanner.nextInt();
        double fee = 0;

        if (input  < 4 )
            System.out.println("Your fee is $2.00 only");

        if (input >= 4){
            input = input - 3;
            fee =  2 +  ( 0.5 * input );
            System.out.printf("Your fee is %.2f only",fee);
        }


    }
}
