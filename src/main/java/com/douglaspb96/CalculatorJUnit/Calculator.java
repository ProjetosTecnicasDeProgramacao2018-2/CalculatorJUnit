package com.douglaspb96.CalculatorJUnit;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Calculator {
	public int evaluate(String expression) {
		int sum = 0;
		
		String[] lista = expression.split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)");
		//String[] l2 = expression.split("\\-");
		
		int i = 0;
		while(i < lista.length) {
			String valor = lista[i];
			
			if(valor.equals("+") || valor.equals("-")) {
				if(i+1 < lista.length) {
					String valor2 = lista[i+1];
					if(valor2.equals("+") || valor2.equals("-")) {
						valor = valor2 + lista[i+2];
						i+=3;
					}else {
						valor += valor2;
						i+=2;
					}
				}
			}else {
				i++;
			}
			sum += Integer.parseInt(valor);
			
			System.out.println(valor);
		}
		
		return sum;
		/*
		int sum = 0;
		for (String summand : expression.split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)"))
			sum += Integer.valueOf(summand);
		return sum;
		*/
	}
}
