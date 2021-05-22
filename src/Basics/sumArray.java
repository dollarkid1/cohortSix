package Basics;

public class sumArray {
    public static void A(int... m){
        int total = 0;
        for (int x1: m) {
            total = total + x1;
        }
        System.out.println("The Sum is "+ total);
    }

    public static void main(String... args) {
        A(3,34,3,34,3,42,545,43);
    }
}
