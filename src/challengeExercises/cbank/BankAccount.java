package challengeExercises.cbank;

public class BankAccount {
    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;
    private double balance;

    public BankAccount() {
        this("Default Number", "John Doe",
                "dojndoe@gmail.com", 23456, 2.0);
    }

    public BankAccount(String accountNumber, String customerName, String customerEmail, int customerPhoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String email) {
        customerEmail = email;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        if (amount > 0)
            balance += amount;
    }
    public void withdraw(int amount){
        if (balance > 0 && amount > 0)
            balance -= amount;
    }

}
