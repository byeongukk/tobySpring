package com.home.toby.e1.example4.practice2.member.model.service;

import java.sql.SQLException;

import com.home.toby.e1.example4.practice2.common.DConnectionMaker;
import com.home.toby.e1.example4.practice2.common.factory.DaoFactory;
import com.home.toby.e1.example4.practice2.member.model.dao.MemberDao;
import com.home.toby.e1.example4.practice2.member.model.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	private DaoFactory daoFactory;
	
	public MemberServiceImpl(DaoFactory daoFactory) {
		this.daoFactory =  daoFactory;
	}

	@Override
	public MemberVO login() throws ClassNotFoundException, SQLException {
		
		MemberDao memberDao = daoFactory.memDao();
		
		return memberDao.login();
	}
	
}
