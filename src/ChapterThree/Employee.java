package ChapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yearlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary > 0){
        this.monthlySalary=monthlySalary;}
        else {
            System.out.println("Invalid input");
        }
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void setYearlySalary(double monthlySalary){
        yearlySalary = monthlySalary*12;
    }

    public double getYearlySalary(){
        return yearlySalary;
    }













}
