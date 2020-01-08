package com.home.toby.e1.example4.practice2.member.model.dao;

import java.sql.SQLException;

import com.home.toby.e1.example4.practice2.member.model.vo.MemberVO;

public interface MemberDao {

	MemberVO login() throws SQLException, ClassNotFoundException;

}
