package challengeExercises.masterChallengeDataStructure;

import java.util.Scanner;

public class Sort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int[] getIntegers (int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+ capacity + "integer values:\r");
        for (int i = 0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+ i + "content"+ array[i]);
        }
    }




}
