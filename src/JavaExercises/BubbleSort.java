package JavaExercises;
public class BubbleSort {
    public static void bubbleSort(int[] array) throws InterruptedException {

        int temp = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 1+i; j < array.length; j++)
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

    }

    public static void main(String[] args) throws InterruptedException {
        bubbleSort(new int[]{32,45,36,1,23,56,46,24,34,99,110,100});
    }
}
