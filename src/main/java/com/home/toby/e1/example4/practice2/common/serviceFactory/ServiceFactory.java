package com.home.toby.e1.example4.practice2.common.serviceFactory;

import com.home.toby.e1.example4.practice2.member.model.service.MemberService;
import com.home.toby.e1.example4.practice2.member.model.service.MemberServiceImpl;

public class ServiceFactory {
	
	public MemberService memSer() {
		return new MemberServiceImpl();
	}
	
}
