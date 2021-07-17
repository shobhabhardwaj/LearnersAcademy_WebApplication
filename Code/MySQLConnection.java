package com.dbutil;

import java.sql.*;


public class MySQLConnection {
	private static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (Exception e) {
			e.printStackTrace();
		}
		connection=DriverManager.getConnection("jdbc:mysql:///learnersacademy","root","mysql");
		return connection;
	}
}
