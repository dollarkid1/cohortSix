package ourFirstTddClass;

public class MyAccount {
    private double accountBalance;
    private String accountName;
    private int accountPin;
    public void setBalance(double amount) {
        this.accountBalance = amount;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setName(String name) {
        this.accountName = name;

    }

    public String getName() {
        return accountName;
    }

    public void setPin(int code) {
    this.accountPin=code;

    }
        public  int getAccountPin(){
        return accountPin;
        }

    public double getCash(double amount) {
        accountBalance = accountBalance - amount;

        return amount;
    }
}

