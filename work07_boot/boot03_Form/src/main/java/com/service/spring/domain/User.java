package com.service.spring.domain;

public class User {

	private String userId;
	private String userName;
	private String userAddr;
	private String password;

	public User() {
	}

	public User(String userId, String userName, String userAddr, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddr = userAddr;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddr=" + userAddr + ", password=" + password
				+ "]";
	}

}
