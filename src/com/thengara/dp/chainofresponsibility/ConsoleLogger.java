package com.thengara.dp.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	public void writeLog(String message) {
		System.out.println(this.getClass().getName() + ": Logger : " + level + " : " + message);
	}

}
