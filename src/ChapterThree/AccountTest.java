package ChapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("dan lee", -50.00);
        Account account2 = new Account("stan lee",50.00);

        System.out.printf("%s  balance: N%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s  balance: N%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("enter the amount you want to deposit for account1");
        double amount1 = input.nextDouble();
        account1.deposit(amount1);

        System.out.println("enter the amount you want to deposit for account2");
        double amount2 = input.nextDouble();
        account2.deposit(amount2);

        System.out.printf("%s  balance: N%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s  balance: N%.2f%n", account2.getName(), account2.getBalance());

        System.out.println("enter amount you want to withdraw for account1:");
        double withdrawAmount1= input.nextDouble();
        account1.withdraw(withdrawAmount1);

        System.out.println("enter amount you want to withdraw for account2:");
        double withdrawAmount2= input.nextDouble();
        account1.withdraw(withdrawAmount2);

        System.out.printf("%s  balance: N%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s  balance: N%.2f%n", account2.getName(), account2.getBalance());
    }
}
