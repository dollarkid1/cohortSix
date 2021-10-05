package challengeExercises.exercises.animal;

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

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);

    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
}
