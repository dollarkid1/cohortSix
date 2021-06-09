package Chapter7;

public class SieveOfEratosthenes {

    public boolean[] findPrimeIndices(boolean[] n) {
        for (int i = 2; i < n.length; i++) {
            if (n[i]){
                eliminateMultiples(n,i);
            }
        }
        return n;
    }

    private void eliminateMultiples(boolean[] numbers, int i){
        int multiple;
        for (int j = 2; j < numbers.length ; j++) {
            multiple = i * j;
            if (multiple < numbers.length){
                numbers[multiple] = false;
            }
            else break;
        }
    }

    public static void main(String[] args) {

    }

}
