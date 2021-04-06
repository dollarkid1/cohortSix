package ChapterFive;

import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to sum, input 0 to end program");
        int data = in.nextInt();
        int sum = 0;
        while (data!=0){
            sum+=data;
            System.out.println("enter a number to sum, input 0 to end program");
            data = in.nextInt();
        }
        System.out.println("the total sum is "+ sum);
    }
}
