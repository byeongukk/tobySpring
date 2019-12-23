package com.home.toby.example1;

import java.sql.SQLException;

//테스트를 위한 mainClass
public class Main {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("uukk");
		user.setName("최병욱");
		user.setPassword("123123");
		
		//dao.add(user);
		
		System.out.println(user.getId() + "등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + "조회 성공");
	}

}
