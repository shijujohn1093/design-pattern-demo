package com.thengara.dp.template;

public class Chess extends Game {

	@Override
	public void init() {
		System.out.println(this.getClass().getSimpleName() + " initialized");
	}

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " Started");

	}

	@Override
	public void end() {
		System.out.println(this.getClass().getSimpleName() + " End");

	}

}
