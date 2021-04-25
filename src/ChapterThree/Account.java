package ChapterThree;

public class Account {

    private String name;
    private double balance;



    public Account(String name, double balance){
        this.name = name;

        if (balance>0.0)
            this.balance = balance;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void deposit (double depositAmount) {
        if (depositAmount>0.0)
        balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount>0)
        if (withdrawAmount<=balance)
        balance -= withdrawAmount;
    }


}
