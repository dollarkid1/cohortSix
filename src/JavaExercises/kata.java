package JavaExercises;

import java.security.SecureRandom;

public class kata {
    static int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private static final SecureRandom secureRandom = new SecureRandom();
    public static void shuffling(int[] array){

        for (int i = 0; i < 6; i++) {

            int temp;
            int a = secureRandom.nextInt(14);
            int b = secureRandom.nextInt(14);

            int p1 = a;
            int p2 = b;

            int num1 = array[a];
            int num2 = array[b];

            temp = num1;
            num1 = num2;
            num2 = temp;

            array[p1] = num1;
            array[p2] = num2;

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









   public static void max(){

   }


    public static void main(String[] args) {
        max();
        shuffling(array);
        System.out.println();
        shuffle(array);
    }
}
