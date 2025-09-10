package com.emp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmagdb", "root", "tiger");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return con;

	}

}
