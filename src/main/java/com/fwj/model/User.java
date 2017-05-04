package com.fwj.model;

public class User {

	
	private int userId;
	private String userName;
	private String userAge;
	
	public User() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public User(int id,String name,String age){
		super();
		this.userId = id;
		this.userName = name;
		this.userAge = age;		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + "]";
	}
}
