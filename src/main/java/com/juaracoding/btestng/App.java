package com.juaracoding.btestng;

public class App 
{
    public static void main( String[] args )
    {
        int a = 10;
        int b = 2;
        int expected = 12;

        int actual = Calculator.add(a, b);

        if (expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Fail");
        }
    }
}
