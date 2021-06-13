package Basics.checkPoint;

public class b {
    public static class Test {
        public static void main(String[] args) {
            int number = 0;
            int[] numbers = new int[1];
            m(number, numbers);
            System.out.println("number is " + number
                    + " and numbers[0] is " + numbers[0]);
        }
        public static void m(int x, int[] y) {
            x = 3;
            y[0] = 3;
        }
    }
}
