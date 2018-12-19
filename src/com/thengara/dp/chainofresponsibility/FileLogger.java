package com.thengara.dp.chainofresponsibility;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	public void writeLog(String message) {
		System.out.println(this.getClass().getName() + ": Logger : " + level + " : " + message);
	}

}
