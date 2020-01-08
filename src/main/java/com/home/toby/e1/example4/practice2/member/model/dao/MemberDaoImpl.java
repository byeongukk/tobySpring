package com.home.toby.e1.example4.practice2.member.model.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.home.toby.e1.example4.practice2.common.ConnectionMaker;
import com.home.toby.e1.example4.practice2.member.model.vo.MemberVO;

public class MemberDaoImpl implements MemberDao {
	private ConnectionMaker connectionMaker;
	
	public MemberDaoImpl(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	@Override
	public MemberVO login() throws SQLException, ClassNotFoundException {
		
		String id = "uukk";
		//DB 연결
		Connection c = connectionMaker.makeConnection();
		
		PreparedStatement ps = c.prepareStatement("SELECT MID,EMAIL FROM MEMBER WHERE MID = ?");
		ps.setString (1 , id);
		ResultSet rs = ps.executeQuery();
		rs. next();
		
		MemberVO loginMember = new MemberVO();
		loginMember.setmId(rs.getString("MID"));
		loginMember.setEmail(rs.getString("EMAIL"));
		
		rs.close();
		ps.close();
		c.close();
		
		return loginMember;
	}
}
