package challengeExercises.masterChallengeOOP;

public class test {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56, "White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        System.out.println("Total Burger price is "+ hamburger.itemizedHamburger());

        HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon",5.67);
        healthyHamburger.addHealthAddition1("Egg",5.43);
        healthyHamburger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger Price "+ healthyHamburger.itemizedHamburger()  );


        DeluxeBurger db =new DeluxeBurger();
        db.itemizedHamburger();
    }
}
