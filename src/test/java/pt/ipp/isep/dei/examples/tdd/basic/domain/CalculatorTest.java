package pt.ipp.isep.dei.examples.tdd.basic.domain;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @BeforeAll
    public static void classSetUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place before any @Test is executed");
    }

    @AfterAll
    public static void classTearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place after all @Test are executed");
    }

    @BeforeEach
    public void setUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place before each @Test is executed");
    }

    @AfterEach
    public void tearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place after each @Test is executed");
    }

    @Test
    @Disabled
    public void failingTest() {
        //fail("a disabled failing test");
    }

    /**
     * Test to ensure two positive numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arrange: one positive number (three) and another positive number (two).<p>
     * Act: sum both numbers (three and two).<p>
     * Assert: the result is five.
     */
    @Test
    public void ensureThreePlusTwoEqualsFive() {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 5;
        int firsOperand = 3;
        int secondOperand = 2;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test to ensure positive and negative numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arranje a positive number (three) and a negative number (minus two)<p>
     * Act I sum three to minus two<p>
     * Assert the sum result should be one.
     */
    @Test
    public void ensureThreePlusMinusTwoEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 3;
        int secondOperand = -2;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }


    /**
     * SUM
     */
    // 4 + 3 = 7
    @Test
    public void ensureFourPlusThreeEqualsSeven() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 3;
        int expectedResult = 7;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //4 + -3 = 1
    @Test
    public void ensureFourPlusMinusThreeEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = -3;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //-4 + 3 = -1
    @Test
    public void ensureMinusFourPlusThreeEqualsMinusOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = 3;
        int expectedResult = -1;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //-4 + -3 = -7
    @Test
    public void ensureMinusFourPlusMinusThreeEqualsMinusSeven() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = -3;
        int expectedResult = -7;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //4 + 0 = 4
    @Test
    public void ensureFourPlusZeroEqualsFour() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 0;
        int expectedResult = 4;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }


    //0 + 3 = 3
    @Test
    public void ensureZeroPlusThreeEqualsThree() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 0;
        int secondOperand = 3;
        int expectedResult = 3;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //-4 + 0 = -4
    @Test
    public void ensureMinusFourPlusZeroEqualsMinusFour() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = 0;
        int expectedResult = -4;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }


    //0 + -3 = -3
    @Test
    public void ensureZeroPlusMinusThreeEqualsMinusThree() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 0;
        int secondOperand = -3;
        int expectedResult = -3;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }


    /**
     * SUBTRACT
     */
    //4 - 3 = 1
    @Test
    public void ensureFourMinusThreeEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 3;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //4 - -3 = 7
    @Test
    public void ensureFourMinusMinusThreeEqualsSeven() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = -3;
        int expectedResult = 7;
        int result = 3;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //-4 - 3 = -7
    @Test
    public void ensureMinusFourMinusThreeEqualsMinusSeven() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = 3;
        int expectedResult = -7;
        int result = 3;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }


    //-4 - -3 = -1
    @Test
    public void ensureMinusFourMinusMinusThreeEqualsMinusOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = -3;
        int expectedResult = -1;
        int result = 3;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //4 - 0 = 4
    @Test
    public void ensureFourMinusZeroEqualsFour() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 0;
        int expectedResult = 4;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //0 - 3 = -3
    @Test
    public void ensureZeroMinusThreeEqualsMinusThree() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 0;
        int secondOperand = 3;
        int expectedResult = -3;
        int result = 3;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    //-4 - 0 = -4
    @Test
    public void ensureMinusFourMinusZeroEqualsMinusFour() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = 0;
        int expectedResult = -4;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }


    //0 - -3 = 3
    @Test
    public void ensureZeroMinusMinusThreeEqualsThree() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 0;
        int secondOperand = -3;
        int expectedResult = 3;
        int result = 3;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Multiply
     */
    @Test
    public void ensureFourTimesThreeEqualsTwelve(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 12;
        int firsOperand = 4;
        int secondOperand = 3;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureFourTimesMinusThreeEqualsMinusTwelve(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = -12;
        int firsOperand = 4;
        int secondOperand = -3;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusFourTimesThreeEqualsMinusTwelve(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = -12;
        int firsOperand = -4;
        int secondOperand = 3;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusFourTimesMinusThreeEqualsTwelve(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 12;
        int firsOperand = -4;
        int secondOperand = -3;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureFourTimesZeroEqualsZero(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 0;
        int firsOperand = 4;
        int secondOperand = 0;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureZeroTimesThreeEqualsZero(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 0;
        int firsOperand = 0;
        int secondOperand = 4;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusFourTimesZeroEqualsZero(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 0;
        int firsOperand = -4;
        int secondOperand = 0;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureZeroTimesMinusThreeEqualsZero(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 0;
        int firsOperand = 0;
        int secondOperand = -3;
        int result = 3;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Divide
     */
    @Test
    public void ensureEightDividedByThreeEqualsTwo(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 2;
        int firsOperand = 8;
        int secondOperand = 3;
        int result = 3;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureEightDividedByMinusThreeEqualsMinusTwo(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = -2;
        int firsOperand = 8;
        int secondOperand = -3;
        int result = 3;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusEightDividedByThreeEqualsMinusTwo(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = -2;
        int firsOperand = -8;
        int secondOperand = 3;
        int result = 3;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusEightDividedByMinusThreeEqualsTwo(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 2;
        int firsOperand = -8;
        int secondOperand = -3;
        int result = 3;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureEightDividedByZeroThrowsError(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Assert
        assertThrows(ArithmeticException.class, ()-> {
            int firsOperand = 8;
            int secondOperand = 0;
            new Calculator().divide(firsOperand, secondOperand);
        });

    }

    @Test
    public void ensureZeroDividedByThreeEqualsZero(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 0;
        int firsOperand = 0;
        int secondOperand = 3;
        int result = 3;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusEightDividedByZeroThrowsError(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Assert
        assertThrows(ArithmeticException.class, ()-> {
            int firsOperand = -8;
            int secondOperand = 0;
            new Calculator().divide(firsOperand, secondOperand);
        });
    }

    @Test
    public void ensureZeroDividedByMinusThreeEqualsZero(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 0;
        int firsOperand = 0;
        int secondOperand = -3;
        int result = 3;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Factorial
     */
    @Test
    public void ensureFactorialOfThreeEqualsSix(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 6;
        int firstOperand = 3;
        int result = 3;

        // Act
        result = new Calculator().factorial(firstOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureFactorialOfMinusThreeEqualsOne(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 1;
        int firstOperand = -3;
        int result = 3;

        // Act
        result = new Calculator().factorial(firstOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureFactorialOfZeroEqualsOne(){
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 1;
        int firstOperand = 0;
        int result = 3;

        // Act
        result = new Calculator().factorial(firstOperand);

        // Assert
        assertEquals(expectedResult, result);
    }




}



