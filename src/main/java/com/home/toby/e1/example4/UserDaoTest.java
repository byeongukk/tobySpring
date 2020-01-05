package com.home.toby.e1.example4;

import java.sql.SQLException;

//테스트를 위한 mainClass
public class UserDaoTest {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		UserDao dao = new DaoFactory().userDao();
		
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
