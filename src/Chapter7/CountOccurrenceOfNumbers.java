package Chapter7;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];
        int[] count = new int[100];


        int  temp = 0;
        System.out.println("Enter the integers between 1 and 100: ");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] == 0)break;
        }
        for (int a: numbers) System.out.print(a + " ");

        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            count[temp]++;
        }
        System.out.println();
        for (int a: count) System.out.print(a + " ");

        for(int i= 1; i < count.length; i++){

            if(count[i] > 0 && count[i] == 1){
                System.out.printf("%d occurs %d time\n",i, count[i]);
            }
            else if(count[i] >=2){
                System.out.printf("%d occurs %d times\n",i, count[i]);
            }


        }
    }
}
