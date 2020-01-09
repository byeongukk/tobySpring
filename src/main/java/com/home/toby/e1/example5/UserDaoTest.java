package com.home.toby.e1.example5;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserDaoTest {
	/* 
	 * 1.5.1
	 * 
	 * 애플리케이션 컨텍스트는 ApplicationContext 타입의 오브젝트
	 * @Configuration이 붙은 java코드를 설정정보로 사용하라면,
	 * AnnotationConfigApplicationContext 클래스를 이용
	 * 
	 * getBean으로 Bean으로 설정된 객체를 가져올 수 있음
	 * (@Bean 이 붙은 메소드이름 / 해당 class)
	 * 
	 * Bean을 생성하는 방식이나 구성을 다르게 하기 위함
	 * 
	 * */
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		//애플리케이션 컨텍스트 생성
		ApplicationContext context 
					= new AnnotationConfigApplicationContext(DaoFactory.class);
		
		//-> 결국에는 UserDao class를 알아야 된다??
		UserDao dao = context.getBean("userDao", UserDao.class);
		
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
