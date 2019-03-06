package com.sunway.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class E07SelectQuery {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunway-java-ee", "root", "mysql");
			ResultSet rs = conn.createStatement().executeQuery("select * from student");
			while (rs.next()) {
				System.out.print(rs.getString(1) + " | ");
				System.out.print(rs.getString(2) + " | ");
				System.out.print(rs.getString(3) + " | ");
				System.out.print(rs.getString(4) + " | ");
				System.out.print(rs.getString(5) + " | ");
				System.out.print(rs.getString(6) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
