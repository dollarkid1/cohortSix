package workingWithTDD;

public class Calculator {


    public int add(int num1, int num2) {
       int result = num1 + num2;
        return result;
    }

    public double add(double v, double v1) {
       double result = v + v1;
        return result;
    }

    public Number subtract(double v, double v1) {
       double result = v - v1;
        return result;
    }


    public int subtract(int v, int v1) {
       int result = v - v1;
        return result;
    }

    public int multiply(int v, int v1) {
       int result = v * v1;
        return result;
    }
    public double multiply(double v, double v1) {
      double  result = v * v1;
        return result;
    }

    public int divide(int i, int i1) {
       int result = i / i1;
        return result;
    }

    public double divide(double i, double i1) {
        if(i1 == 0){
            throw new ArithmeticException();
        }
       double result = i / i1;

        return result;
    }
}
