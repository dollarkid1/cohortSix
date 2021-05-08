package Chapter2Exercises;

import java.util.*;

public class CalculatingRadius {

    public static void main(String[] args) {
        final double PI = 3.14285;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius:");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("the area for the circle of the radius " + radius + " is " + area );
    }
}
