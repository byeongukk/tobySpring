package com.home.toby.e1.example3.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//사용자 정보를 DB에 넣고 관리할 수 있는 DAO 클래스
public class UserDao {
	private ConnectionMaker connectionMaker;
	
	public UserDao(ConnectionMaker connectionMaker) {
		//상태를 관리하는 것도 아니니 한 번만 만들어 인스턴스 변수에 저장해두고
		//메소드에서 사용하게된다.
		this.connectionMaker = connectionMaker;
	}
	
	//
	public void add(User user) throws ClassNotFoundException, SQLException {
		//DB 연결
		Connection c = connectionMaker.makeConnection();
		
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

			//DB 연결
			Connection c = connectionMaker.makeConnection();
			
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

