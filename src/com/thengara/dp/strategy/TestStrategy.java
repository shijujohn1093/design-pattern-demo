package com.thengara.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Context context = new Context(new Addition());

		float value1 = 10;
		float value2 = 11;
		System.out.println("Addition = " + context.execute(value1, value2));

		context = new Context(new Substraction());
		System.out.println("Subtraction = " + context.execute(value1, value2));

		context = new Context(new Multiplication());
		System.out.println("Multiplication = " + context.execute(value1, value2));
	}
}
