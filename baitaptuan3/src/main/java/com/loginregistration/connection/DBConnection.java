package com.loginregistration.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.loginregistration.dao.UserDao;
import com.loginregistration.dao.UserDaoImpl;

public class DBConnection {
	private final String serverName = "localhost";
	private final String dbName = "LoginRegister";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "bao123456789";

	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber + ";databaseName=" + dbName;

		if (instance == null || instance.trim().isEmpty()) {
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName + ";trustServerCertificate=true;";
		}

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}

	public static void main(String[] args) {
		 try {
			 UserDao userDao = new UserDaoImpl();
		 System.out.println(new DBConnection().getConnection());
		 System.out.println(userDao.findById(1));
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
}
}