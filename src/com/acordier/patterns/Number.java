package com.acordier.patterns;

public class Number extends ArithmeticExpression {
	private int value;

	public Number(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int compute() {
		return this.value;
	}

	
}
