package workingWithTDD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Calculator can add numbers")
    void addTwoIntegerNumbers(){
        int sum = calculator.add(2,3);
        assertEquals(5,sum);
    }

    @Test
    @DisplayName("Calculator can add two real numbers")
    void addTwoRealNumbers(){
        double sum = calculator.add(2.5,2.4);
        assertEquals(4.9,sum);
    }

    @Test
    @DisplayName("Calculator can subtract real numbers")
    void subtractTwoRealNumbers(){
        double total = calculator.subtract(5,2);
        assertEquals(3.0,total);
    }

    @Test
    @DisplayName("Calculator can subtract ")
    void subtractTwoNumbers(){
        int total = calculator.subtract(5,2);
        assertEquals(3,total);
    }

    @Test
    @DisplayName("Calculator can multiply ")
    void multiplyTwoNumbers(){
        int total = calculator.multiply(5,2);
        assertEquals(10,total);
    }

    @Test
    @DisplayName("Calculator can divide ")
    void divideTwoNumbers(){
        int total = calculator.divide(5,2);
        assertEquals(2,total);
    }

    @Test
    @DisplayName("Calculator can divide real numbers ")
    void divideTwoRealNumbers(){
        double total = calculator.divide(5.0,2.0);
        assertEquals(2.5,total);
    }

    @Test
    @DisplayName("Zero can't be divide")
    void test_zero(){
        assertThrows(ArithmeticException.class, ()-> calculator.divide(5.0,0));
    }

}