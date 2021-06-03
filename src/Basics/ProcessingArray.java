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

    /*1. Initializing arrays with input values: The following loop initializes the array myList
with user input values*/

    public static void user(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter "+ myList.length + " double values you want to store in the Array!");
        for (int i = 0; i < myList.length; i++) {
            myList[i]=input.nextDouble();
        }
    }


    /*2. Initializing arrays with random values: The following loop initializes the array myList
with random values between 0.0 and 100.0, but less than 100.0.*/

    public static void random(){
        for (int i = 0; i < myList.length; i++)
            myList[i] = Math.random()*100;
    }


    /*3. Displaying arrays: To print an array, you have to print each element in the array using a
loop like the following*/

    public static void display(){
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }


/*TIP.... For an array of the char[] type, it can be printed using one print statement.*/

    public static void displayForChar(){
        char[] charList = {'d','e','e','r'};
        System.out.println(charList);
    }


    /*4. Summing all elements: Use a variable named total to store the sum. */

    public static void sumArray(){
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = myList[i];
        }
        System.out.println(total);
    }

    /*5. Finding the largest element:*/
    
    public static void maxArray(){
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
        }
        System.out.println(max);
    }

    /*6. Finding the smallest index of the largest element:*/

    public static void minArray(){
        double min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min)
                min = myList[i];
        }
        System.out.println(min);
    }


    /*7. Random shuffling:*/

    public static void randomShuffle(){
            int temp; int j= 0;
        for (int i = 0; i < myList.length; i++) {
             j = (int) Math.random() * (i + 1);
              temp = (int) myList[i];
              myList[i] = myList[j];
              myList[j] = temp;
              
        }


    }


    public static void test(){
        
    }




    public static void main(String[] args) {

test();
    }

}


