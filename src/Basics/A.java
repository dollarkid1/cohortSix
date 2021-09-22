package Basics;

import java.util.Random;

public class A {
    public static void main(String[] args) {
        Random random1 = new Random(5);
        System.out.print("From random 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(random1.nextInt(1000)+ " ");
        }
        System.out.println();
        Random random2 = new Random(5);
        System.out.print("From random 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(random2.nextInt(10)+ " ");
        }
    }


//    public static void main(String[] args) {
//        final int ARRAY_LENGTH = 10;
//        int [] x = new int[ARRAY_LENGTH] ;
//        for (int i = 0; i < 10; i++) {
//            x[i] = 2 + 2 * (i);
//        }
//
//        System.out.printf("%s%8s%n", "index", "value");
//        for (int i = 0; i < x.length; i++) {
//            System.out.printf("%5d%8d%n", i, x[i]);
//        }
//
//    }
}
