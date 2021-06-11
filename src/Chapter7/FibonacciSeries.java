package Chapter7;

public class FibonacciSeries {

    public static int fibonacci(int n){

        int[] fibSeries = new int[n];
        fibSeries[1]=1;
        for (int x = 2; x < n; x++) {
            fibSeries[x] = fibSeries[x - 1] + fibSeries[x - 2];
        }

        return fibSeries[n -1];
    }
}
