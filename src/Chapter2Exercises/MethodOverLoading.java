package Chapter2Exercises;

import java.util.Scanner;

public class MethodOverLoading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int x = input.nextInt();
        System.out.println("enter a number:");
        int y = input.nextInt();

        add(x, y);
        subtract(x, y);
        multiply(x, y);
        divide(x, y);
    }

    private static void divide(int x, int y) {
        System.out.println(x/y);
    }

    private static void multiply(int x, int y) {
        System.out.println(x*y);
    }

    private static void subtract(int x, int y) {
        System.out.println(x-y);
    }

    private static void add(int x, int y) {
        System.out.println(x+y);
    }

}
