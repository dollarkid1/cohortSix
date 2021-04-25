package Games;

import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPosition = new ArrayList<>();
    static ArrayList<Integer> computerPosition = new ArrayList<>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'}
                , {' ', '|', ' ', '|', ' '}
                , {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};


        System.out.println("enter a number from 1 to 9:");

        while (true) {

            Scanner in = new Scanner(System.in);
            int playersPosition = in.nextInt();
            System.out.println(playersPosition);
            while (playerPosition.contains(playersPosition) || computerPosition.contains(playersPosition)){
                System.out.print("position has been taken");
                playersPosition = in.nextInt();
            }

            placePiece(gameBoard, playersPosition, "Human");
            String result =  checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }


            Random rand = new Random();
            int computerPosition = 1 + rand.nextInt(9);

            placePiece(gameBoard, computerPosition, "Computer");

            printGameBoard(gameBoard);
            result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }

        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char i : row) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void placePiece(char[][] gameBoard, int position, String user) {
        char symbol = ' ';
        if (user.equals("Human")) {
            symbol = 'X';
            playerPosition.add(position);
        } else if (user.equals("Computer")) {
            symbol = 'O';
            computerPosition.add(position);
        }

        switch (position) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;

        }
    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List firstCol = Arrays.asList(1, 2, 3);
        List secondCol = Arrays.asList(4, 5, 6);
        List thirdCol = Arrays.asList(7, 8, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> won = new ArrayList<List>();
        won.add(topRow);
        won.add(midRow);
        won.add(botRow);
        won.add(firstCol);
        won.add(secondCol);
        won.add(thirdCol);
        won.add(cross1);
        won.add(cross2);

        for (List j : won) {
            if (playerPosition.containsAll(j)) {
                return "Congrats you WON!";
            } else if (computerPosition.containsAll(j)) {
                return "you LOSE!";
            } else if (computerPosition.size() + playerPosition.size() == 9)
                return "it's a TIE";
        }

            return "";
    }
}
