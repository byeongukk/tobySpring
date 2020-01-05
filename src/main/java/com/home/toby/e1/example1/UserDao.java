package com.home.toby.e1.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//사용자 정보를 DB에 넣고 관리할 수 있는 DAO 클래스
public class UserDao {
	
	//
	public void add(User user) throws ClassNotFoundException, SQLException {
		//드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//DB 연결
		Connection c = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TOBY","TOBY");
		//쿼리
		PreparedStatement ps = c.prepareStatement(
		"insert into users(id , name , password) values(?, ?,?)");
		ps.setString(1 , user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		ps.executeUpdate();
		ps.close();
		c.close();
	}
	
	public User get(String id ) throws ClassNotFoundException, SQLException {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//DB 연결
			Connection c = 
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TOBY","TOBY");
			
			PreparedStatement ps = c.prepareStatement("SELECT * FROM USERS WHERE ID = ?");
			ps.setString (1 , id);
			ResultSet rs = ps.executeQuery();
			rs. next();
			User user = new User();
			user.setId (rs.getString("id"));
			user.setName(rs. getString("name"));
			user.setPassword(rs.getString("password"));
			rs.close();
			ps.close();
			c.close();
			return user;
	}
}

