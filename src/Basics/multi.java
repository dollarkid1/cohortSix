package Basics;

public class multi {
    public static void main(String[] args) {
        int [][] array = new int[2][8];
        int [][] array1 = {{23,231,3,3245342,},{8,234},{42}};
        array[1][5]= 934;
        array[0][1]= 934;
        array[1][3]= 934;
        example(new int[][]{{23,24,243,4},{24234,452,4245}} );

    }

    public static void example(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++)
            System.out.printf(" %2d  ", array[row][column]);
            System.out.println("");
        }


    }
}