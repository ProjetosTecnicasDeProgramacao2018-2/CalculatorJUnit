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
        try {
        	System.out.println("Soma: "+c.evaluate("-5+1+-2+--3"));
        }catch(RuntimeException e) {
        	System.out.println(e.getMessage());
        }
    }
}
