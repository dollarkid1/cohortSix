package com.BodyMassIndex;

import java.util.Scanner;

public class BMICalculator {
    public String name;
    public int age;
    public String gender;
    public double height;
    public double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String  getGender() {
        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void calculator(){
        BMICalculator bmi = new BMICalculator();

        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

       double weightInKilograms = bmi.getWeight() * KILOGRAMS_PER_POUNDS ;
       double heightInMeters = bmi.getHeight() * METERS_PER_INCH;
       double bmiResult = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %.2f", bmiResult);
        if (bmiResult < 18.5) System.out.print("Underweight");
        else if (bmiResult < 25) System.out.print("Normal");
        else if (bmiResult < 30) System.out.print("Overweight");
        else System.out.print("Obese");

    }
    public static void setInfo (){
        Scanner scanner = new Scanner(System.in);
        BMICalculator bmi = new BMICalculator();

        System.out.println("Enter a name");
        String name = scanner.next();
        bmi.setName(name);

        System.out.println("Enter a age");
        int age = scanner.nextInt();
        bmi.setAge(age);

        System.out.println("Enter your gender");
        String gender = scanner.next();
        bmi.setGender(gender);

        System.out.println("Enter a height");
        double height = scanner.nextDouble();
        bmi.setHeight(height);

        System.out.println("Enter a weight");
        double weight = scanner.nextDouble();
        bmi.setWeight(weight);
        System.out.println("Hello " + bmi.getName());
        System.out.println("this is your result");
    }

    public static void main(String[] args) {
       setInfo();
       calculator();

    }
}
