package com.thengara.dp.state;

public class Sales implements Connection {

	@Override
	public void open() {

		System.out.println("open database for " + this.getClass().getSimpleName());

	}

	@Override
	public void close() {
		System.out.println("close the database");

	}

	@Override
	public void log() {
		System.out.println("Accounting has been updated");

	}

}
