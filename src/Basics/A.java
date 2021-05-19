package Basics;

public class A {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int [] x = new int[ARRAY_LENGTH] ;
        for (int i = 0; i < 10; i++) {
            x[i] = 2 + 2 * (i);
        }

        System.out.printf("%s%8s%n", "index", "value");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%5d%8d%n", i, x[i]);
        }
        
    }
}
