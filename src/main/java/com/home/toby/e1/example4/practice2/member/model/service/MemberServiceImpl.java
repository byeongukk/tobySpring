package com.home.toby.e1.example4.practice2.member.model.service;

import java.sql.SQLException;

import com.home.toby.e1.example4.practice2.common.serviceFactory.DaoFactory;
import com.home.toby.e1.example4.practice2.member.model.dao.MemberDao;
import com.home.toby.e1.example4.practice2.member.model.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	

	@Override
	public MemberVO login() throws ClassNotFoundException, SQLException {
		
		MemberDao memberDao = new DaoFactory().memDao();
		
		
		return memberDao.login();
	}
	
}
