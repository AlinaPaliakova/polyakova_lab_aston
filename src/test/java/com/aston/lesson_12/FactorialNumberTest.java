package com.aston.lesson_12;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialNumberTest {
    FactorialNumber factorialNumber;


    @BeforeEach
    public void init() {
        factorialNumber = new FactorialNumber();
    }

    @AfterEach
    public void tearDown() {
        factorialNumber = null;
    }

    @Test
    public void testFactorialNumber() {

        assertEquals(1, factorialNumber.getFactorial(1));
        assertEquals(2, factorialNumber.getFactorial(2));
        assertEquals(6, factorialNumber.getFactorial(3));
        assertEquals(24, factorialNumber.getFactorial(4));
        assertEquals(120, factorialNumber.getFactorial(5));
        assertEquals(720, factorialNumber.getFactorial(6));
        assertEquals(5040, factorialNumber.getFactorial(7));
        assertEquals(40320, factorialNumber.getFactorial(8));
        assertEquals(362880, factorialNumber.getFactorial(9));
        assertEquals(3628800, factorialNumber.getFactorial(10));
    }

}
