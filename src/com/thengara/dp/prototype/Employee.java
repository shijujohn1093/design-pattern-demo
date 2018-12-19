package com.thengara.dp.prototype;

public class Employee implements Prototype {

	private final String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public Prototype getClone() {
		return new Employee(name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}
