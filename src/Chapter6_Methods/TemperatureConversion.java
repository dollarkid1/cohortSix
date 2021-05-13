package Chapter6_Methods;

import java.util.Scanner;

public class TemperatureConversion {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Temperature Conversion");
        System.out.println("""
                Enter 1 to convert to celsius
                Enter 2 to convert to fahrenheit
                Enter 3 to to check another
                Enter -1 to stop
                """);
        int userInput = input.nextInt();
        do {
            switch (userInput) {
                case 1 -> {
                    fahrenheitConversion();
                    break;
                }
                case 2 -> {
                    celsiusConversion();
                    break;
                }
                default -> throw new IllegalArgumentException("Pls Enter the correct input");
            }
            System.out.println();
            System.out.println("""
                Enter 1 to convert to celsius
                Enter 2 to convert to fahrenheit
                Enter 3 to to check another
                Enter -1 to stop
                """);
            userInput = input.nextInt();
        }while (userInput != -1);

        System.out.println();
    }


    public static void fahrenheitConversion() {
        System.out.println("Enter the Amount of fahrenheit you want to Convert:");
        double fahrenheit = input.nextDouble();
        double celsius;
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }

    public static void celsiusConversion() {
        System.out.println("Enter the Amount of celsius you want to Convert:");
        double celsius = input.nextDouble();
        double fahrenheit;
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }

}
