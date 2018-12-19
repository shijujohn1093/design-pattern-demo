package com.thengara.dp.chainofresponsibility;

public class TestChain {

	public static void main(String[] args) {

		AbstractLogger chain = getChainOfLogger();

		chain.logMessage(AbstractLogger.INFO, "This is an information"); // printed
		                                                                 // on
		                                                                 // console
		System.out.println("--------------------------------------");
		chain.logMessage(AbstractLogger.DEBUG, "This is a debug level information"); // printed
		                                                                             // on
		                                                                             // console,
		                                                                             // file
		System.out.println("--------------------------------------");

		chain.logMessage(AbstractLogger.ERROR, "This is a error level information"); // alls
	}

	private static AbstractLogger getChainOfLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;

	}
}
