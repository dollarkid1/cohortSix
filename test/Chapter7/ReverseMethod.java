package Chapter7;

import java.util.Arrays;

public class ReverseMethod {
    public static int[] reverse(int[] list){
        int[] array = new int[list.length];

        for (int i = 0, j =  list.length -1; i < array.length; i++, j--) {
            array[i] = list[j];
        }
        // 1.
        Arrays.stream(array).mapToObj(a -> array).forEach(Arrays::toString);
        //2
        for (int a : array) {
            int[] ints = array;
            Arrays.toString(ints);
        }
        //3
        int[]b = new int[0];
        for (int i : array)
            b = array;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{32, 42, 24, 22, 11, 10 ,21})));
        System.out.println(Arrays.toString(reverse(new int[]{5, 8, 98, 0, 86})));
    }
}
