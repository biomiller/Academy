package com.bae.ExceptionPractice.Calculator;

public class Runner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.divideTryCatch(2, 0);
		
		System.out.println("Hello World");
		
		System.out.println(calc.divideThrow(-22, 5));
		
		System.out.println("Hello World");
	}

}
