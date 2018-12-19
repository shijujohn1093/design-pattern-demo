package com.thengara.dp.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection> {

	private final String url;
	private final String user;
	private final String password;

	public JDBCConnectionPool(String url, String user, String password, Long expirationTime, int poolSize) {
		super(expirationTime, poolSize);
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public JDBCConnectionPool(String url, String user, String password) {
		super(30000L, 5);
		this.url = url;
		this.user = user;
		this.password = password;
	}

	@Override
	protected Connection create() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void expire(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean validate(Connection connection) {
		try {
			return connection.isClosed();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
