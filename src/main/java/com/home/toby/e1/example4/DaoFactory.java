package com.home.toby.e1.example4;

//userDao의 생성 책임을 맡은 팩토리 클래스
public class DaoFactory {

	public UserDao userDao() {
		//userDao 타입의 오브젝트를 어떻게 만들고 어떻게 준비시킬지 결정
		return new UserDao(connectionMaker());
		
	}
	
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
	
}
