package ChapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Humble Douglas",0);
        Account account2 =new Account("Fabian Douglas", 0);

        System.out.println(account1.getName()+" your balance is $"+account1.getBalance() );
        System.out.println(account2.getName()+" your balance is $"+account2.getBalance() );

        Scanner input = new Scanner(System.in);

        System.out.println("enter deposit amount:");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.println();


        System.out.println("enter deposit amount:");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        System.out.println();

        System.out.println(account1.getName()+" your balance is $"+account1.getBalance());
        System.out.println(account2.getName()+" your balance is $"+account2.getBalance());

        System.out.println();

        System.out.println("enter amount you want to withdraw:");
        double withdrawAmount = input.nextDouble();
        account1.withdrawal(withdrawAmount);
        System.out.println(account1.getBalance());

        System.out.println();

        System.out.println("enter amount you want to withdraw:");
        withdrawAmount = input.nextDouble();
        account2.withdrawal(withdrawAmount);
        System.out.println(account2.getBalance());

        System.out.println();

        System.out.println(account1.getName()+" your balance is $"+account1.getBalance());
        System.out.println(account2.getName()+" your balance is $"+account2.getBalance());





    }

}
