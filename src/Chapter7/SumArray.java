package Chapter7;

public class SumArray {
    public static void main(String[] args) {

        int[] x = {37,22,39,10,33,97,73,12};
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        System.out.printf("Total of array elements %s%n", total);
    }
}
