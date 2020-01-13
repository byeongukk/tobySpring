package com.home.toby.e1.example5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //빈 팩토리를 위한 오브젝트 설정을 담당하는 클래스 애노테이션
public class DaoFactory {
	/*
	 * 1.5.1
	 * @Configuration 
	 * -> 빈 팩토리를 위한 오브젝트 설정을 담당하는 클래스로 선언
	 * 
	 * @Bean
	 * -> 오브젝트를 생성하고 초기화 하는 메소드에 붙여줌
	 * 
	 * 이 두 가지 애노테이션으로 스프링에서 빈 팩토리 또는 애플리케이션 컨텍스트가
	 * IoC 방식의 기능을 제공할때 사용할 설정정보가 됨
	 * 
	 * Java코드로 작성되었지만, XML과 같은 스프링 전용 설정 정보라 보는 것이 좋음.
	 * */
	@Bean
	public UserDao userDao() {
		return new UserDao(connectionMaker());
		
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
	
}
