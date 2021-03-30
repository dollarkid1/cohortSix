package JavaExercises;

public class AccessMethodsWithAnObject {
    public void fullThrottle() {
        System.out.println("the car is going as fast as it can");
    }

    public void speed(int maxSpeed){
        System.out.println("car speeds is " + maxSpeed + "mph");
    }

    public static void main(String[] args) {
      AccessMethodsWithAnObject car = new AccessMethodsWithAnObject();
       car.fullThrottle();
       car.speed(250);

    }

}
