package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class Search{
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key){
        int low =  0;
        int high = list.length-1;
        int mid = (high + low)/2;
        while (high >= low){

            if (key < list[mid]) high = mid - 1;
            else if (key == list[mid]) return mid;
            else low = mid + 1;
            mid = (high + low)/2;
        }

        int i = -1;
        return i;

    }

    public static void main(String[] args) {

        int[] list = new int[20];
        int[] my = new int[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            list[i]= 1 + random.nextInt(20);
        }

        for (int i = 0; i < 20; i++) {
            my[i]= 1 + random.nextInt(20);
        }

        int listRandom = 1 + random.nextInt(20);
        int myRandom = 1 + random.nextInt(20);

        Arrays.sort(list);
        Arrays.sort(my);

        System.out.println("list array");
        for (int i: list)
            System.out.print(i+" ");

        System.out.println();

        System.out.println("my array ");
        for (int a :my)
            System.out.print(a+" ");

        int k = linearSearch(list,listRandom);
        int d = binarySearch(my,myRandom);

        System.out.println();

        System.out.println(listRandom + " is located at index " + k);
        System.out.println(myRandom  + " is located at index " + d);


    }
}
