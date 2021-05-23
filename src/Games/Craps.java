package Games;
import java.security.SecureRandom;

public class Craps {
    static SecureRandom random = new SecureRandom();

    private enum Status { CONTINUE, WON, LOST }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void play() {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Your Point is %d%n", myPoint);
            }
        }

        if (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if (sumOfDice == myPoint)
                gameStatus = Status.WON;

            else
            if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }

        if (gameStatus == Status.WON)
            System.out.println("You Win!");
        else
            System.out.println("You Lose!");

    }

    public static int rollDice(){
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void main(String[] args) {
        play();
    }

}
