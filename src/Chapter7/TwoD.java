package Chapter7;

import java.util.Scanner;

public class TwoD {

      static   int [][] matrix = new int[3][3];

      public static void input(){
          Scanner scanner = new Scanner(System.in);

          for (int r = 0; r < matrix.length; r++) {
              for (int c = 0; c < matrix[r].length; c++) {
                  matrix[r][c]= scanner.nextInt();
              }
          }

          for(int i[] : matrix){
              for (int j : i)
                  System.out.print(j+" ");
          }
          System.out.println();
      }

    public static void main(String[] args) {
        input();
    }
}
