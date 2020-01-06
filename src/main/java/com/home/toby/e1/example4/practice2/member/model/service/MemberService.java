package com.home.toby.e1.example4.practice2.member.model.service;

import java.sql.SQLException;

import com.home.toby.e1.example4.practice2.member.model.vo.MemberVO;

public interface MemberService {

	MemberVO login() throws ClassNotFoundException, SQLException;

}
