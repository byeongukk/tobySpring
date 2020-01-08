package com.home.toby.e1.example4.practice2.common.factory;

import com.home.toby.e1.example4.practice2.common.ConnectionMaker;
import com.home.toby.e1.example4.practice2.common.DConnectionMaker;
import com.home.toby.e1.example4.practice2.member.model.dao.MemberDao;
import com.home.toby.e1.example4.practice2.member.model.dao.MemberDaoImpl;

public class DaoFactory {
	
	public MemberDao memDao() {
		return new MemberDaoImpl(connectionMaker());
	}
	
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
