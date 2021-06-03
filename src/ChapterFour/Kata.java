package ChapterFour;

import java.util.Scanner;

public class Kata {

    //    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber){
//     double average = (firstNumber + secondNumber + thirdNumber)/ 3.0;
//     return average;
//
//    }
//
// public String calculateGrade(int score){
//     if(score>=90){
//         return  "A";
//     }
//    else if(score <=80){
//        return "B";
//
//     }
//    else if(score <=70){
//        return "C";
//     }
//
//    else {
//        return  "F";
//     }
//
//    }
//public static void inputCollection(String[] args) {
//    Scanner input = new Scanner(System.in);
//    int  copies;
//
//    System.out.println("HELLO\n How many copy do you want:");
//    copies = input.nextInt();
//    calculatePrice(copies);
//}
//    public static void inputCollection(String[] args) {
//        Scanner input= new Scanner(System.in);
//        int x=input.nextInt();
//        calculatePrice(x);
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("put amount of copies:");
        calculatePrice(input.nextInt());
    }


        public static int calculatePrice ( int copies){

            if (copies >= 1 && copies <= 4)
                System.out.println(1500 + "Naira");

            if (copies >= 5 && copies <= 9)
                System.out.println(1400 + "Naira");

            if (copies >= 10 && copies <= 29)
                System.out.println(1200 + "Naira");

            if (copies >= 30 && copies <= 49)
                System.out.println(1100 + "Naira");

            if (copies >= 50 && copies <= 99)
                System.out.println(1000 + "Naira");

            if (copies >= 200)
                System.out.println(800 + "Naira");

            if (copies <= 0)
                System.out.println("invalid input");
            return copies = 1500;
        }







    }



