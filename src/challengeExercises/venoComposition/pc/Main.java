package challengeExercises.venoComposition.pc;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimension);
        Monitor monitor = new Monitor("27inch Beast", "Acer",27, new Resolution(2540,1440));
        MotherBoard motherBoard = new MotherBoard("B3-200","Asus", 4, 6, "v2.44");
        PC thePc = new PC(theCase,monitor,motherBoard);
        thePc.powerUp();
    }
}
