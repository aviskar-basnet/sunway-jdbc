package com.sunway.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static void main(String[] args) {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "mysql");
			System.out.println("Database connection successful.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
