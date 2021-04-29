package pt.ipp.isep.dei.examples.tdd.basic.domain;

import static java.lang.Math.abs;

/**
 * Calculator class.
 * This class is very simple in order to demonstrate how to build test cases for Unit Testing.
 */
public class Calculator {

    /**
     * Sums one operand to the other, returning the result.
     *
     * @param firstOperand  First operand to sum.
     * @param secondOperand Second Operand to sum.
     * @return The sum of firstOperand with secondOperand.
     */
    public int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    public int divide(int dividend, int divisor) throws ArithmeticException {
        return dividend /divisor;
    }

    public int multiply(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    public int factorial(int firstOperand) {
        int result = 1;
        for (int i = 1; i <= firstOperand; i++){
            result *= i;
        }

        return result;
    }
}
