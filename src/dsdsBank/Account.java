package dsdsBank;

public class Account {
    private String accountName;
    private int accountNumber;
    private int pin;
    private double balance;



    public Account(int accountNumber, String accountName, double balance,int pin){
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.pin=pin;
    }

    public void setPin(int newPin){
       pin=newPin;
    }

    public int getPin(){

        return pin;
    }

    public double getBalance(){

        return balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount,int pin) {
        if (this.pin == pin && amount > 0 && amount <= balance)
            balance -= amount;

    }
    public void transfer(int accountNumber, int pin, double transferAmount){
        if(this.pin==pin && transferAmount>0 && transferAmount<=balance)
            balance-=transferAmount;

    }

    public int getAccountNumber() {
        return accountNumber;
    }


}
