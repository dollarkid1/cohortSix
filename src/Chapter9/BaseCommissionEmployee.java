package Chapter9;

public class BaseCommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;
    private double baseSalary;

    public BaseCommissionEmployee(String firstName, String lastName,
                                  String socialSecurityNumber, double grossSale,
                                  double commissionRate, double baseSalary) {

        if (grossSale <0.0)throw new
                IllegalArgumentException("Gross sale must be >= 0.0");
        if (commissionRate <= 0.0 || commissionRate >= 1.0 )throw new
                IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        if (baseSalary < 0.0)throw new
                IllegalArgumentException("Base salary must be >= 0.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSale(double grossSale){
        if (grossSale <0.0)throw new IllegalArgumentException("Gross sale must be >= 0.0");
        this.grossSale = grossSale;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0 )throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings (){
        return baseSalary + (commissionRate * grossSale);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f ",
                "based-salaried commission employee", firstName, lastName,
                "social security number",socialSecurityNumber,
                "gross sale", grossSale, "commission rate", commissionRate,
                "base salary", baseSalary);
    }
}
