package Chapter2Exercises;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter fahrenheit:");
        int fahrenheit = input.nextInt();
        float celsius = (5.0f / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");

    }
}
