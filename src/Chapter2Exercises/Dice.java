package Chapter2Exercises;

public class Dice {
    public static void main(String[] args) {
    long[] diceNumbers = new long [6];
    for (int a = 0; a < 60_000_000; a++){
        diceNumbers[generateDiceNumbers()] += 1;
    }

    System.out.println("number\tcount");
    for (int a = 0; a < diceNumbers.length; a++){
        System.out.printf("%d\t\t%d%n", a + 1, diceNumbers[a]);
    }
    }

    private static int generateDiceNumbers() {
        int diceNumbers = (int) Math.round(Math.random() * 1000);
        return diceNumbers % 6;
    }

}