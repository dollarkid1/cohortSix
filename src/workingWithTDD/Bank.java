package workingWithTDD;

public class Bank {
    private final String accountName;
    private final int accountNumber;
    private double balance;

    public Bank(String accountName, int accountNumber, double balance){

        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    public String getAccountName(String accountName) {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double cash) {
    if (cash < 0 ||cash > balance )
        cash = 0;

        balance -= cash;
    }

    public void deposit(double cash) {
        if (cash < 0 ) cash = 0;
        balance += cash;
        System.out.println(balance);
    }
}
