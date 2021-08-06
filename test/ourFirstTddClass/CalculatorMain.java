package ourFirstTddClass;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInputCollector = new Scanner(System.in);
        {
            String prompt = """
                    hello user,
                    ->welcome to Lasu calculator,
                    ->enter 1 for addition,
                    ->enter 2 for absolute subtraction,
                    ->enter 3 for multiplication,
                    ->enter 4 for division,
                            
                    """;
            System.out.println(prompt);
            int userChoice = userInputCollector.nextInt();
            System.out.println("Enter first number");
            int firstNumber = userInputCollector.nextInt();
            System.out.println("Enter second number");
            int secondNumber = userInputCollector.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println(calculator.add(firstNumber, secondNumber));
                case 2:
                    System.out.println(calculator.substract(firstNumber, secondNumber));
                case 3:
                    System.out.println(calculator.multiply(firstNumber, secondNumber));
                case 4:
                    System.out.println(calculator.divide(firstNumber, secondNumber));
                default:
                    System.out.println("oga enter something reasonable");


            }


        }
    }
}
