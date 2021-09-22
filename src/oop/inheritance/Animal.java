package oop.inheritance;

public class Animal {
    private String name;
    private int age;
    private String sound;


    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void walk(){
        System.out.println("I can move");
    }

    public void eatingType(){
        System.out.println("I can eat");
    }

    public void mate(){
        System.out.println("I do have sex with opposite sex");
    }

}
