package challengeExercises.animal;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.tails = tails;
        this.legs = legs;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
       // super.eat();
    }
}
