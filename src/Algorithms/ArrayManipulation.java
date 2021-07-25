package Algorithms;

public class ArrayManipulation {
    public static void md(int value){
        int [] array = {1,2,3,4,5};
        int [] ar = new int[array.length];

        if (value > 0) {
            if (value > array.length)
                value = value % array.length;
            System.out.println(value);
        }

        if (value < 0) {
            if (value < array.length)
                value = -array.length + value;
            System.out.println(value);
        }

    }

    public static void main(String[] args) {
        md(-9);
    }
}
