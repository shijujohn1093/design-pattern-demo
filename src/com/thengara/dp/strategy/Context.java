package com.thengara.dp.strategy;

public class Context {

	private final Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public float execute(float a, float b) {
		return strategy.calculation(a, b);
	}

}
