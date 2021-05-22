package Chapter7;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount sold:");
        double amount = scanner.nextDouble();

        double earning = (200 +(0.09 *amount)) / 100;

    }
}
