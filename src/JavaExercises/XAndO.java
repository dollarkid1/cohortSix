package JavaExercises;

public class XAndO {
    public static void main(String[] args) {
        char[][] gameBoard = {{'X', '|', 'O', '|', 'X'},
                            {'-', '+', '-', '+', '-'}
                            , {'O', '|', 'O', '|', 'X'}
                            , {'-', '+', '-', '+', '-'},
                {'O', '|', 'X', '|', 'O'}};

        for (char [] i : gameBoard) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
