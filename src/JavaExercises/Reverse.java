package JavaExercises;

public class Reverse{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] list = new int[array.length];

        for (int i = 0, j = array.length - 1; i < list.length; i++, j--) {
            list[i] = array[j];

    }

        for (int a : list)
        System.out.print(a + " ");
    }
}
