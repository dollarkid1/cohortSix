package JavaExercises;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void ap(){
        System.out.println("Enter Three Numbers ");
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5, num6,num7,num8,num9,num10;
        int ver1, ver2, nextNumber;

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();


        ver1 = num2 - num1;
        ver2 = num3 - num2;
        int number = 0;

        nextNumber = number + num4;
        num5 = num4 + ver1;
        num6 = num4 + ver1 * 2;
        num7 = num4 + ver1 * 3;
        num8 = num4 + ver1 * 4;
        num9 = num4 + ver1 * 5;
        num10 = num4 + ver1 * 6;

        if (ver1 == ver2) {
            number = ver1;
            System.out.println(num1 +"-"+ num2 +"-"+ num3 +"-"+ num4+"-"+
                    num5 +"-"+num6 +"-"+ num7 +"-"+ num8 +"-"+ num9+"-"+ num10);
        }
        else
            System.out.println(" Arrange the number in a sorted order");




    }

    public static void main(String[] args) {
        ap();
    }
}
