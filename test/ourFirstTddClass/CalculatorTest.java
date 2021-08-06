package ourFirstTddClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void startAllTestsWith() {
        calculator = new Calculator();
    }

//    @AfterEach
//    void endEachTestWithThis() {
//    }

   @Test
        void addTwoNumbersTest(){
       //given
//       Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(3,2));
       assertEquals(7, calculator.add(5,2));
       assertEquals(8, calculator.add(3,5));

}

        @Test
        @DisplayName("Testing for multiplication")
        void twoNumbersCanBeMultipliedTest(){
//          Calculator calculator = new Calculator();
         assertEquals(4, calculator.multiply(2,2));




        }
        @Test
        @DisplayName("two numbers can be divided")
        void twoNumbersToYieldFloatTest(){
//        Calculator calculator = new Calculator();

           assertEquals(2, calculator.divide(6,3));
           assertEquals(5, calculator.divide(15,3));
           assertEquals(2.5,calculator.divide(5,2));
        }

        @Test
        @DisplayName("divde by zero return zero")
            void divisionByZeroTest(){
//               Calculator calculator = new Calculator();
               assertEquals(0,calculator.divide(5,0));
        }


     @Test
//    @DisplayName("subtracting the secondNumber from the firstNumbber")
            void difference_canBeCalculated(){
                assertEquals(5,calculator.substract(10,5));
            }
     @Test
     void difference_willProduceAbsoluteResult(){
      assertEquals(5,calculator.substract(5,10));

     }










}
