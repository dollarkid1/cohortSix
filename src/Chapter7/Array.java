package Chapter7;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[]c= new int[12];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        int temp = c[0];
        for (int i = 1; i < c.length; i++) {
            c[i - 1] = c[i];
        }
        c[c.length-1] = temp;
        System.out.println(Arrays.toString(c));


    }
}
