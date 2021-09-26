package challengeExercises.animal;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fin;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fin) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fin = fin;
    }
    private void rest(){

    }
    private void moveMuscle(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){
        moveMuscle();
        moveBackFin();
        super.move(speed);
    }

}
