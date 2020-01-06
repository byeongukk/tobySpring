package com.home.toby.e1.example4.practice2.member.controller;

import java.sql.SQLException;

import com.home.toby.e1.example4.practice2.common.serviceFactory.ServiceFactory;
import com.home.toby.e1.example4.practice2.member.model.service.MemberService;
import com.home.toby.e1.example4.practice2.member.model.vo.MemberVO;

public class MemberController {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		MemberService memberService = new ServiceFactory().memSer();
		
		MemberVO loginMember = memberService.login();
		System.out.println(loginMember);
	}
}
