package com.thengara.dp.state;

public class TestState {

	public static void main(String[] args) {
		test("management");
	}
	public static void test(String con) {
		Controller controller = new Controller();

		// the following trigger should be made by the user
		if (con.equalsIgnoreCase("management")) {
			controller.setManagementconnection();;
		}
		if (con.equalsIgnoreCase("sales")) {
			controller.setSalesConnection();
		}
		if (con.equalsIgnoreCase("accounting")) {
			controller.setAccountingConnection();
		}
		controller.open();
		controller.log();
		controller.close();
	}
}
