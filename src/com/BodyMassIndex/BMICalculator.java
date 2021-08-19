package com.BodyMassIndex;

import java.util.Scanner;

public class BMICalculator {
    public String name;
    public int age;
    public String gender;
    public double height;
    public double weight;
   static BMICalculator bmi = new BMICalculator();

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

       double weightInKilograms = bmi.getWeight();
       double heightInMeters = bmi.getHeight();
       double bmiResult = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %2.2f\n", bmiResult);
        if (bmiResult < 18.5) System.out.print("Underweight");
        else if (bmiResult < 25) System.out.print("Normal");
        else if (bmiResult < 30) System.out.print("Overweight");
        else System.out.print("Obese");

    }
    public static void setInfo (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = scanner.next();
        bmi.setName(name);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        bmi.setAge(age);

        System.out.println("Enter your gender");
        String gender = scanner.next();
        bmi.setGender(gender);

        System.out.println("Enter your height in metres");
        double height = scanner.nextDouble();
        bmi.setHeight(height);

        System.out.println("Enter your weight in kilograms");
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
