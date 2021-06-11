package com.tictactoe;


public class MoveOutOfBoundsException extends Exception {
    public MoveOutOfBoundsException() {
    }

    public MoveOutOfBoundsException(String message) {
        super(message);
    }
}
