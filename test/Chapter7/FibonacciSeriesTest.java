package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {
  @Test
    void fibonacci(){
      int result = FibonacciSeries.fibonacci(9);
      assertEquals(21,result);
  }
}