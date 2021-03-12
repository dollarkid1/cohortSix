package Chapter2Exercises;

public class MethodsWithParameters {
    static void names(String firstName, int age){
        System.out.println(firstName + " Douglas is " + age);
    }

    public static void main(String[] args) {
        names("Humble", 20);
        names("Fabian", 18);
        names("Dandison", 15);
    }
}
