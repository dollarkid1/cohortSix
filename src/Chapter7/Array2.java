package Chapter7;

public class Array2 {
    public static void main(String[] args) {


        int[] array = {17,9,23,4,3,2,45};
        System.out.printf("%s%8s%n" ,"index" ,"value" );

        for(int counter= 0; counter < array.length; counter++)
        System.out.printf("%5d%8d%n", counter, array[counter]);

    }
}
