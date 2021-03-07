package Chapter2Exercises;

import java.util.Scanner;

public class perimeterOfAnAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter width:");
        double width = input.nextDouble();

        System.out.println("enter height:");
        double height = input.nextDouble();

        double area = width * height;

        System.out.println("Area is " + area);



    }
}
