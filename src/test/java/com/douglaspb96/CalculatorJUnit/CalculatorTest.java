package com.douglaspb96.CalculatorJUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	
	@Before
	public void inicializa() {
		this.calculator = new Calculator();
	}
	
	@Test
	public void calculatorVariasSomasTest() {
		int resp = this.calculator.evaluate("5+3+2");
		assertEquals(10,resp);
	}

	@Test
	public void calculatorSoUmNumeroTest() {
		int resp = this.calculator.evaluate("5");
		assertEquals(5,resp);
	}
}
