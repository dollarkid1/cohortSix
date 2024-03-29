package dsdsBank;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account humbleAccount= new Account(217143, "Humble Douglas",90000.00,6889);
        Account sarahAccount= new Account(419419,"Sarah A",500.00,2090);

        System.out.println("enter pin");
        Scanner input = new Scanner(System.in);
        int pin = input.nextInt();
        if(pin== humbleAccount.getPin()){


            String prompt = """
                    Press 1 for Withdrawal
                    Press 2 for Deposit
                    Press 3 for Transfer
                    Press 4 for Check balance
                    Press 5 to  Change pin
                    Press 6 to Exit
                    """;


                System.out.println(prompt);
                int userChoice = input.nextInt();
                switch (userChoice) {
                    case 1 -> {
                        System.out.println("ENTER AMOUNT TO WITHDRAW");
                        double amount = input.nextDouble();
                        if (amount > 0) {
                            if (amount <= humbleAccount.getBalance()) {
                                humbleAccount.withdraw(amount, pin);
                                System.out.println("Withdraw Successful");
                                break;
                            } else
                                System.out.println("insufficient balance");
                            break;
                        } else
                            System.out.println("invalid amount");
                    }
                    case 2 -> {
                        System.out.println("ENTER AMOUNT TO DEPOSIT");
                        double depositAmount = input.nextDouble();
                        humbleAccount.deposit(depositAmount);
                        System.out.println("successful transaction");
                    }
                    case 3 -> {
                        System.out.println("ENTER BENEFICIARY ACCOUNT NUMBER");
                        int accountNumber = input.nextInt();
                        if (accountNumber == sarahAccount.getAccountNumber()) {
                            System.out.println("enter amount to transfer");
                            int transferAmount = input.nextInt();
                            if (transferAmount > 0) {
                                if (transferAmount <= humbleAccount.getBalance()) {
                                    humbleAccount.transfer(sarahAccount.getAccountNumber(), transferAmount, pin);
                                    System.out.println("Withdraw Successful");
                                    break;
                                } else
                                    System.out.println("insufficient balance");
                                break;
                            } else
                                System.out.println("invalid amount");
                            break;

                        } else
                            System.out.println("invalid account number");
                    }
                    case 4 -> {
                        System.out.println("your balance is " + humbleAccount.getBalance());
                        ;
                    }
                    case 5 -> {
                        System.out.println("enter new pin");
                        int newPin = input.nextInt();
                        humbleAccount.setPin(newPin);
                        System.out.println("Pin Changed Successfully");
                    }
                    case 6 -> System.out.println("THANKS FOR USING OUR SERVICE");

            }

        }
    }
}
