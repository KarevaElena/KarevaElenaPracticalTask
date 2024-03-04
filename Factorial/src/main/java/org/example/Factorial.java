package org.example;


public class Factorial {
    public static void main( String[] args ) {
        System.out.println(getFactorial(32));
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
