package challengeExercises.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie", 8,1, 20, 20, 2, 4,1, 40,"Long silky");
       // dog.eat();
        dog.walk();
       // dog.run();

        Fish fish = new Fish("sean",8,1,4,12,2,2,4);
       // fish.swim();


    }
}
