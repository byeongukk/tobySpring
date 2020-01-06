package com.home.toby.e1.example4.practice2.common.serviceFactory;

import com.home.toby.e1.example4.practice2.common.ConnectionMaker;
import com.home.toby.e1.example4.practice2.common.DConnectionMaker;
import com.home.toby.e1.example4.practice2.member.model.dao.MemberDao;

public class DaoFactory {
	
	public MemberDao memDao() {
		return new MemberDao(connectionMaker());
	}
	
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
