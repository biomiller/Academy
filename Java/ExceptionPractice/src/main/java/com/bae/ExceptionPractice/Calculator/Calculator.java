package com.bae.ExceptionPractice.Calculator;

public class Calculator {
	
	public int divideTryCatch(int a, int b) {
		try {
			return a/b;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			return Integer.MIN_VALUE;
		}
	}
	
	public int divideThrow(int a, int b) throws ArithmeticException {
		return a/b;
	}
	
	

}
