package challengeExercises.vehicle;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla(72);
        tesla.accelerate(30);
        System.out.println();
        tesla.accelerate(20);
        System.out.println();
        tesla.accelerate(10);
    }
}
