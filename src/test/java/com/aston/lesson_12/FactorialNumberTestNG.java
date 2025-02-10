package com.aston.lesson_12;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class FactorialNumberTestNG {
    FactorialNumber factorialNumber;

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


    @BeforeMethod
    public void init() {
        factorialNumber = new FactorialNumber();
    }

    @AfterMethod
    public void tearDown() {
        factorialNumber = null;
    }

    @DataProvider(name = "negativeNumbers")
    public Object[][] createNegativeNumbers() {
        return new Object[][]{
                {Integer.valueOf(-1)},
                {Integer.valueOf(-5)},
                {Integer.valueOf(-10)}
        };
    }

    @Test(dataProvider = "negativeNumbers")
    public void testCalculateFactorialWithNegativeNumbers(int number) {
        try {
            factorialNumber.getFactorial(number);
        } catch (IllegalArgumentException e) {
            return;
        }
        assert false : "Ожидалось исключение IllegalArgumentException";
    }
}


