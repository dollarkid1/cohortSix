package Basics;
/* initialising arrays with user inputs and random numbers
* feeling the vibes
* next level 4 */

import java.security.SecureRandom;
import java.util.Scanner;

public class ProcessingArray {

    public final static double[] myList;

    static {
        myList = new double[10];
    }

    public static void user(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter "+ myList.length + " double values you want to store in the Array!");
        for (int i = 0; i < myList.length; i++) {
            myList[i]=input.nextDouble();
        }
    }

    public static void random(){
        for (int i = 0; i < myList.length; i++)
            myList[i] = Math.random()*100;
    }

}
