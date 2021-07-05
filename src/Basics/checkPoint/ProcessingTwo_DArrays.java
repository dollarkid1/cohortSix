package Basics.checkPoint;

import java.security.SecureRandom;
import java.text.MessageFormat;
import java.util.Scanner;

public class ProcessingTwo_DArrays {

    private static final int[][] array = new int[10][10];
    /*1. Initializing arrays with input values. The following loop initializes the array with user
         input values:*/

    static void inputValues() {
        System.out.println(MessageFormat.format("Enter {0} rows and {1} columns: ", array.length, array[0].length));
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        for (int []k: array){
            System.out.println();
            for (int j : k) System.out.print(j+" ");}
    }


    /*2. Initializing arrays with random values. The following loop initializes the array with
         random values between 0 and 99:*/

    static void randomValues() {
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        for (int []k: array){
            System.out.println();
            for (int j : k) System.out.print(j+" ");}
    }


    /*4. Summing all elements. Use a variable named total to store the sum. Initially total is
          0. Add each element in the array to total using a loop like this:*/

    static void elementsSum(int[][] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              total +=  array[i][j] ;
            }
        }
        for (int []k: array){
            System.out.println();
            for (int j : k) System.out.print(j+" ");}

    }






    public static void main(String[] args) {
        randomValues();
        System.out.println();
        inputValues();
    }



}