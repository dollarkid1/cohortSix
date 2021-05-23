package JavaExercises;

import java.security.SecureRandom;

public class kata {
    static int[] array = {5,4,3,6,2,1,8,7,9,10,15,11,12,14,13};
    private static final SecureRandom secureRandom = new SecureRandom();
    public static void shuffling(int[] array){

        for (int i = 0; i < 6; i++) {

            int temp;
            int a = secureRandom.nextInt(14);
            int b = secureRandom.nextInt(14);

            int num1 = array[a];
            int num2 = array[b];

            temp = num1;
            num1 = num2;
            num2 = temp;

            array[a] = num1;
            array[b] = num2;

        }

        for(int i : array)
            System.out.print(i+"|");

    }

    public static void shuffle(int [] array){

        int temp ;

        for(int first = 0; first< array.length; first++) {
            int second = secureRandom.nextInt(15);
            temp = array[first];
            array[first] = array[second];
            array[second] = temp;
        }
        for (int i : array) {
            System.out.print(i+"-");
        }
    }


    public static void sortAscend(){
        int temp = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 1+i; j < array.length; j++)
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        for (int i: array)
            System.out.print(i+"|");
    }

   public static void sortDesc(){
        int temp = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = i; j < array.length; j++)
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
       for (int i: array)
           System.out.print(i+"|");

   }


    public static void main(String[] args) {
        sortAscend();
        System.out.println();
        sortDesc();
        System.out.println();
        shuffle(array);
        System.out.println();
        shuffling(array);
    }
}
