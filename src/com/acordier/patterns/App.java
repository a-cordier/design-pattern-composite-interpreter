package com.acordier.patterns;

/**
 * Design pattern composite: Client.
 * @author acordier
 *
 */
public class App {
	
	/*
	 * Client only has to take care about
	 * a single object: AritmeticExpression
	 */
	public static void main(String[] args) {
		ArithmeticExpression e1 = new Number(3);
		ArithmeticExpression e2 = new Addition(e1, new Number(2));
		ArithmeticExpression e3 = new Addition(e1, e2);
		/* 3 + 2 + 3 = 8 */
		System.out.println(e3.compute());
	}

}
