package com.specialpos.user.domain;

public class SposUser {
	private String UserId;
	private String mallCode;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userJob;
	private String userBelongTo;
	private int userSal;
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getMallCode() {
		return mallCode;
	}
	public void setMallCode(String mallCode) {
		this.mallCode = mallCode;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserJob() {
		return userJob;
	}
	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	public String getUserBelongTo() {
		return userBelongTo;
	}
	public void setUserBelongTo(String userBelongTo) {
		this.userBelongTo = userBelongTo;
	}
	public int getUserSal() {
		return userSal;
	}
	public void setUserSal(int userSal) {
		this.userSal = userSal;
	}
	
}
