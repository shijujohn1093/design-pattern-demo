package com.thengara.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) {

		Employee employee = new Employee("Shiju");
		System.out.println(employee);
		System.out.println(employee.getClone());

	}

}
