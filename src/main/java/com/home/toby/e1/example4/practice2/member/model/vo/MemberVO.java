package com.home.toby.e1.example4.practice2.member.model.vo;

import java.sql.Date;

public class MemberVO {
	private int mNo;
	private String mId;
	private String mPwd;
	private String email;
	private String mStatus;
	private String eCheck;
	private Date joinDate;
	
	public MemberVO() {}

	public MemberVO(int mNo, String mId, String mPwd, String email, String mStatus, String eCheck, Date joinDate) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPwd = mPwd;
		this.email = email;
		this.mStatus = mStatus;
		this.eCheck = eCheck;
		this.joinDate = joinDate;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPwd() {
		return mPwd;
	}

	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}

	public String geteCheck() {
		return eCheck;
	}

	public void seteCheck(String eCheck) {
		this.eCheck = eCheck;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPwd=" + mPwd + ", email=" + email + ", mStatus=" + mStatus
				+ ", eCheck=" + eCheck + ", joinDate=" + joinDate + "]";
	}
}
