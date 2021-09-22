package Chapter7.turtle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    @Test
    void test_Constructor(){
        Turtle miles = new Turtle();
        assertNotNull(miles.getPen());
    }

    @Test
    void test_ThatPenPositionIsUpWhenTurtleIsCreated(){
        Turtle miles = new Turtle();
        assertEquals(PenPosition.UP, miles.getPenPosition());
    }

    @Test
    void test_ThatTurtleCanSetPenDown(){
        Turtle miles = new Turtle();
        miles.setPenDown();
        assertEquals(PenPosition.DOWN, miles.getPenPosition());
    }

    @Test
    void test_ThatTurtleCanSetPenUpWhenItIsDown(){
        Turtle miles = new Turtle();
        miles.setPenDown();
        miles.setPenUp();
        assertEquals(PenPosition.UP, miles.getPenPosition());
    }
}
