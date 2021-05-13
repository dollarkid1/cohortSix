package Chapter6_Methods;



public class SeparatingDigits {

    public static void main(String[] args) {
        divide(32, 2332);
        remainder(53, 10);
        System.out.println(digits(1234567234));
    }

    public static int divide(int number1, int number2) {

        int quotient = number1 / number2;
        return quotient;
    }

    public static int remainder(int number1, int number2) {

        int result = number1 % number2;
        return result;
    }

    public static String digits(int n) {
        int unit = 0;
        String values = "";

        while (n > 0) {
            unit = remainder(n, 10);
            values = unit + "  " + values;
            n = divide(n, 10);
        }
        return values;
    }
}