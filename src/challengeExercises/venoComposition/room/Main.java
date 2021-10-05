package challengeExercises.venoComposition.room;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling (12,55);
        Bed bed = new Bed("Modena", 4,3,2,1);
        Lamp lamp = new Lamp("Veno",false,75);

        BedRoom bedRoom = new BedRoom("Dans",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        System.out.println();
        bedRoom.getLamp().turnOn();
    }
}
