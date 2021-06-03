package Chapter7;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class DuplicateElimination {
    public final static double[] myList;

    static {
        myList = new double[5];
    }
    public static void inputCollection() {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        System.out.println("enter "+ myList.length + " double values you want to store in the Array!");
        for (int i = 0; i < myList.length; i++) {
            myList[i]=input.nextDouble();
        }
        for (int i = 0; i < myList.length; i++) {


            if (userInput == myList[i])

            System.out.println(myList[i]);
    }


    }

    public static void main(String[] args) {
        inputCollection();
    }
}
