package com.thengara.dp.state;

public class Controller {

	public Accounting acct;
	public Sales sales;
	public Management management;

	Connection connection;

	Controller() {
		acct = new Accounting();
		sales = new Sales();
		management = new Management();
	}

	public void setAccountingConnection() {
		connection = acct;
	}

	public void setSalesConnection() {
		connection = sales;
	}

	public void setManagementconnection() {
		connection = management;
	}

	public void open() {

		connection.open();

	}

	public void close() {
		connection.close();

	}

	public void log() {
		connection.log();

	}

}
