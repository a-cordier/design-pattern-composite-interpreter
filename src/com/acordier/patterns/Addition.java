package com.acordier.patterns;

public class Addition extends Binary {

	public Addition(ArithmeticExpression op1, ArithmeticExpression op2) {
		super(op1, op2);
	}

	@Override
	public int compute() {
		return getOp1().compute() + getOp2().compute();
	}
	
	

}
