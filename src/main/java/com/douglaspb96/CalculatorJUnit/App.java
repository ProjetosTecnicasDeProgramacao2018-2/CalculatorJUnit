package com.douglaspb96.CalculatorJUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator c = new Calculator();
        System.out.println("Soma: "+c.evaluate("-5+1+2+-3"));
    }
}
