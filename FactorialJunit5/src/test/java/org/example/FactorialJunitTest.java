package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialJunitTest {
    @Test
    public void testFactorial() {
        Assertions.assertEquals(FactorialJunit.getFactorial(5),120);
    }
    @Test
    public void testFactorialOfZero() {
        Assertions.assertEquals(FactorialJunit.getFactorial(0),1);
    }
    @Test
    public void testFactorialOfOne() {
        Assertions.assertEquals(FactorialJunit.getFactorial(1),1);
    }
    @Test
    public void testFactorialOfANegativeNumber() {
        Assertions.assertEquals(FactorialJunit.getFactorial(-5), 1);
    }
    @Test
    public void testMaximumFactorialForInt() {
        Assertions.assertEquals(FactorialJunit.getFactorial(31), 738197504);
    }
    @Test
    public void testFactorial32() {
        Assertions.assertEquals(FactorialJunit.getFactorial(32), Integer.MIN_VALUE);
    }
}
