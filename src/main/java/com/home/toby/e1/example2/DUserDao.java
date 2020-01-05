package com.home.toby.e1.example2;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// 커넥션 생성코드
		return null;
	}
	
}
