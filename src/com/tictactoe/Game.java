package com.tictactoe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Game {
    private Board gameBoard;
    private boolean gameWon;
    private boolean boardFull;
    boolean lastValuePlayedWasX;
    int movesMade = 0;


    public Game() {
        this.gameBoard = new Board();
        this.gameWon = false;
        this.boardFull = false;
        this.lastValuePlayedWasX = false;
    }

    public void makeMove(int gridPosition) throws GameOverException, BoardFullException, AlreadyOccupiedException, MoveOutOfBoundsException {
        if (gridPosition < 1 || gridPosition > 9) {
            throw new MoveOutOfBoundsException("position must be between 1 and 9");
        }
        if (boardFull) {
            throw new BoardFullException();
        }
        int position = gridPosition - 1;
        int row = position / 3;
        int column = position % 3;
        Value[][] array = gameBoard.getArray();
        if (array[row][column] != Value.EMPTY) {
            throw new AlreadyOccupiedException();
        }
        if (lastValuePlayedWasX) {
            array[row][column] = Value.O;
            lastValuePlayedWasX = false;
        } else {
            gameBoard.getArray()[row][column] = Value.X;
            lastValuePlayedWasX = true;
        }

        if (isGameWon()) {
            gameWon = true;
            String winner = (lastValuePlayedWasX) ? "x" : "0";
            throw new GameOverException("Game over " + winner + "won");
        }
        if (movesMade < 9) {
            movesMade++;
        }
        if (movesMade == 9) {
            boardFull = true;
        }
    }

    public boolean isGameWon() {
        Value[][] array = gameBoard.getArray();
        for (int row = 0; row < array.length; row++) {
            Set<Value> values = new HashSet<>();
            for (int column = 0; column < array[row].length; column++) {
                values.add(array[row][column]);
            }
            if (!values.contains(Value.EMPTY) && values.size() == 1) {
                return true;
            }
        }
        for (int column = 0; column < array.length; column++) {
            Set<Value> values = new HashSet<>();
            for (int row = 0; row < array.length; row++) {
                values.add(array[row][column]);
            }
            if (!values.contains(Value.EMPTY) && values.size() == 1) {
                return true;
            }
        }
        Set<Value> leftDiagonalValues = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int row = i;
            int column = i;
            leftDiagonalValues.add(array[row][column]);
        }
        if (!leftDiagonalValues.contains(Value.EMPTY)
                && leftDiagonalValues.size() == 1) {
            return true;
        }

        int row = 2;
        int column = 0;
        Set<Value> rightDiagonalValues = new HashSet<>();
        for (; row >= 0; row--) {
            for (; column < array.length; column++) {
                rightDiagonalValues.add(array[row][column]);
            }
        }
        if (!rightDiagonalValues.contains(Value.EMPTY)
                && leftDiagonalValues.size() == 1) {
            return true;
        }

        return false;
    }

    public Value[][] getBoard() {
        return gameBoard.getArray();
    }

    public void displayBoard() {
        gameBoard.displayBoard();
    }

    public boolean isWon() {
        return gameWon;
    }
}










