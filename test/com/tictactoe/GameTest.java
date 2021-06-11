package com.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;
    @BeforeEach
    void setUp(){
        game = new Game();
    }

    @Test
    void testThatPlayerCanMakeMove() throws BoardFullException, GameOverException, AlreadyOccupiedException, MoveOutOfBoundsException {
        game. makeMove(9);
    }


    @Test
    void testThatXCanNotBePlayedTwice(){

    }
    @Test
    void testThatPlayerCantMoveOutOfBounds(){

    }

}