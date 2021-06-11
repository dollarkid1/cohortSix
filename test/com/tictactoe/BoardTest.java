package com.tictactoe;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void boardArrayShouldNotBeNullOnInitialization() {
        assertNotNull(board.getArray());
    }

    @Test
    void boardArrayShouldBeFilledWithEmptyValuesOnInitialization() {
        Value[][] array = board.getArray();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                assertEquals(Value.EMPTY, array[row][column]);
            }
        }
    }

    @Test
    void boardShouldDisplayArray(){
        board.displayBoard();
    }

}