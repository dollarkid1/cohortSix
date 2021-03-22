package Chapter2Exercises;

public class MathPowerAndRemainder {
    public static void main(String[] args) {

        System.out.println("Power");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2.5, 2));
        System.out.println(Math.pow(2.5, -2));
        System.out.println(Math.pow(2,3.5));
        System.out.println();

        System.out.println("Remainder");
        System.out.println( 56 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);
        System.out.println(102 % 7);
        System.out.println();
        
        System.out.println("checking out the result");
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);

    }
}
