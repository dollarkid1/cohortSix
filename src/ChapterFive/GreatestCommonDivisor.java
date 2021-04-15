package ChapterFive;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer:");
        int n1= input.nextInt();
        System.out.println("enter second integer:");
        int n2= input.nextInt();

        int gcd = 1; // Initial gcd is 1

        int k = 2; // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++; // Next possible gcd
        }

        System.out.println(gcd);

    }
}
