package com.sunway.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class E02DatabaseCreate {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "mysql");
			conn.createStatement().executeUpdate("create database sunway-java-ee");
			System.out.println("Database created successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
