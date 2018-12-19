package com.thengara.dp.builder;

public abstract class MenuItem {

	protected final String name;

	public MenuItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
