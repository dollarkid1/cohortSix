package JavaExercises;

import java.util.Arrays;

public class SevenSegmentDisplay {
    static int[][] board = new int[5][4];
        public static void display(){
            for (var  i : board) {
                for (var j: i) {
                    if (j == 1)
                        System.out.print("* ");
                    else System.out.print("  ");

                }
                System.out.println();
            }
        }
        public static void writeOnA(){
            Arrays.fill(board[0], 1);
        }
    public static void writeOnB(){
        for (int i = 0; i < board[0].length  - 1; i++) {
            board[i][3] = 1;
        }
    }
    public static void writeOnC(){
        for (int i = 2; i <= board[0].length ; i++) {
            board[i][3] = 1;
        }
    }
    public static void writeOnD(){
        for (int i = 0; i < board[0].length; i++) {
            board[4][i] = 1;
        }
    }
    public static void writeOnE(){
        for (int i = 2; i <= board[0].length ; i++) {
            board[i][0] = 1;
        }
    }
    public static void writeOnF(){
        for (int i = 0; i < board[0].length - 1; i++) {
            board[i][0] = 1;
        }
    }
    public static void writeOnG(){
        for (int i = 0; i < board[0].length; i++) {
            board[2][i] = 1;
        }
    }

    public static void setValue(String input){

            if (input.length() > 8 ) {
                input = input.substring(0,8);
            }


            char[] array = input.toCharArray();
            for (char i : array){
                if (!(i == '1' || i == '0')){
                    throw new IllegalArgumentException("the input must be 0's and 1's only");
                }
            }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1'){
                switch (i){
                    case 0 -> writeOnA();
                    case 1 -> writeOnB();
                    case 2 -> writeOnC();
                    case 3 -> writeOnD();
                    case 4 -> writeOnE();
                    case 5 -> writeOnF();
                    case 6 -> writeOnG();


                }

            }


        }
    }


}
