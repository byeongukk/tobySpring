package com.home.toby.e1.example4.practice;

import com.home.toby.e1.example3.DConnectionMaker;

public class DaoFactory {
	public UserDao userDao() {
		//Dao 가 늘어날 것에 대비해 메소드로 뺸다.
		ConnectionMaker connectionMaker = connectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		return userDao;
	}
	
	public ConnectionMaker connectionMaker() {
		return new NConnectionMaker();
	}
}
