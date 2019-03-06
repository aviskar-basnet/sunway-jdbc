package com.sunway.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class E10PreparedStatement {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunway-java-ee", "root",
					"mysql");
			PreparedStatement preparedStatement = conn
					.prepareStatement("insert into student values (null, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, "Aviskar Basnet");
			preparedStatement.setByte(2, (byte) 23);
			preparedStatement.setString(3, "Male");
			preparedStatement.setString(4, "Kathmandu");
			preparedStatement.setString(5, "9805420907");
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
