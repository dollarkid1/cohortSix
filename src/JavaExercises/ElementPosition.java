package JavaExercises;

import java.util.Arrays;

public class ElementPosition {
    public static int[] checker(int[] number){

        for (int val: number) {
            if (val % 2 != 0){
                val *= 2;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(checker(new int[]{1, 2, 3, 4, 5})));
    }

}
