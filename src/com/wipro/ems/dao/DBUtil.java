package com.wipro.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Factory Design pattern
public class DBUtil { // Factory Class

	public static Connection getDBConnection() { // factory method

		Connection conn = null;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db", "root", "admin");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

}
