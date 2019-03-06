package com.sunway.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class E08UpdateQuery {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunway-java-ee", "root",
					"mysql");
			conn.createStatement().executeUpdate("update student set name='Av Basnet' where id=1");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
