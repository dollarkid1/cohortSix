package Chapter6_Methods;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number :");
        int n1= in.nextInt();
        System.out.println("enter a number :");
        int n2= in.nextInt();
        System.out.println("the Greatest Common Divisor of "+n1+" & "+n2+" is "+gcd(n1,n2));
    }
    public static int gcd(int n1,int n2){
        int gcd=1,k=2;

        while (k<=n1&&k<=n2){
            if (n1%k==0&&n2%k==0)
                gcd=k;
            k++;

        }

        return gcd;

    }

}
