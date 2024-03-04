package org.example;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test
    public static void testFactorial() {
        assertEquals(120,Factorial.getFactorial(5));
    }
    @Test
    public static void testFactorialOfZero() {
        assertEquals(1,Factorial.getFactorial(0));
    }
    @Test
    public static void testFactorialOfOne() {
        assertEquals(1, Factorial.getFactorial(1));
    }
    @Test
    public static void testFactorialOfANegativeNumber() {
        assertEquals(Factorial.getFactorial(-5), 1);
    }
    @Test
    public static void testMaximumFactorialForInt() {
        assertEquals(Factorial.getFactorial(31), 738197504);
    }
    @Test
    public static void testFactorial32() {
        assertEquals(Factorial.getFactorial(32), Integer.MIN_VALUE);
    }
}
