package com.home.toby.e1.example4.practice2.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PORTFOLIO","PORTFOLIO");
		return c;
	}
	
}
