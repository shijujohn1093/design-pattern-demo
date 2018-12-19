package com.thengara.dp.chainofresponsibility;

public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected AbstractLogger nextLogger;
	protected int level;

	void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	void logMessage(int level, String message) {
		if (this.level <= level) {
			writeLog(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}

	}

	public abstract void writeLog(String message);

}
