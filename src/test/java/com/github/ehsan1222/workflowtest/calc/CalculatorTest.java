package com.github.ehsan1222.workflowtest.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void sum_SumTwoDigits() {
        Calculator calculator = new Calculator();

        double actual = calculator.sum(12.1, 5.2);

        assertEquals(17.3, actual);
    }

}