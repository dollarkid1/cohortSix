package Chapter7.TwoDimension;

import java.security.SecureRandom;

public class SumTwoD {
    public static void sumAllElementsInColumn(int[][] matrix){
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }
    }
    public static void sumAllElements(int[][] array){
        //Sum all elements in the array
        int total = 0;
        for (int[] i: array){
            for (int k : i){
                total += k;
            }
        }
        System.out.println(total);
    }

    public static void shuffling(int[][] array ){
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int i1 =  secureRandom.nextInt(array.length);
                int j1 = secureRandom.nextInt(array.length-1);
                int temp = array[i][j];
                array[i][j] = array[i1][j1];
                array[i1][j1] = temp;
            }
        }
        for (int[] a: array){
            for (int k : a){
                System.out.print(k+" ");
            }System.out.println("");
        }
    }



    public static void main(String[] args) {
        int[][] matrix = new int[5][4];

//      initializing the array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
//      printing the array
        for (int[] i: matrix){
            for (int k : i){
                System.out.print(k+" ");
            }System.out.println("");
        }


        sumAllElementsInColumn(matrix);
        shuffling(matrix);




    }
}
