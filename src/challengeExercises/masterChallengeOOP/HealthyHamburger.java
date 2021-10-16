package challengeExercises.masterChallengeOOP;

public class HealthyHamburger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyHamburger( String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if (this.healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added "+ this.healthyExtra1Name+ " for an extra "+ this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added "+ this.healthyExtra2Name+ " for an extra "+ this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
