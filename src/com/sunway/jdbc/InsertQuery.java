package com.sunway.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertQuery {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunway-java-ee", "root",
					"mysql");
			conn.createStatement().executeUpdate(
					"insert into student values (null, 'Av Basnet', 23, 'Male', 'Kathmandu', '9805420907')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
