package JavaExercises;

import org.junit.jupiter.api.Test;

import static JavaExercises.ReorderString.reorder;
import static org.junit.jupiter.api.Assertions.*;

class ReorderStringTest {
    @Test
    void testToReorder(){
        String input = "is2 thi1s T4est 3a";
        assertEquals("thi1s is2 3a T4est", reorder(input));
    }

}