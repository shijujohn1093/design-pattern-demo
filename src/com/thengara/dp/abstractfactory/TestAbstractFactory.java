package com.thengara.dp.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		FactoryCreator factoryCreator = new FactoryCreator();
		factoryCreator.getFactory("Bank");
	}

}
