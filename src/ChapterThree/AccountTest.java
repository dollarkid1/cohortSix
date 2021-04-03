package ChapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.println("your initial name is " + myAccount.getNAme());
        System.out.println();
        System.out.println("enter your name:");
        String userName = input.next();
        myAccount.setName(userName);
        System.out.println(myAccount.getNAme());

    }

}
