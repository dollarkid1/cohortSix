package oop.inheritance;

public class MainTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 2, "sound");
        Dog dog = new Dog();
        Cat cat = new Cat();
        Snake snake = new Snake();

        snake.eatingType();
        cat.eatingType();
        dog.eatingType();
    }
}
