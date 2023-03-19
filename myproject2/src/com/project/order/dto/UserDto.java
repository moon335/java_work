package com.project.order.dto;

public class UserDto {
	
	private int id;
	private String userId;
	private String password;
	private String userName;
	private String address;
	private String tel;
	
	public UserDto() {

	}
	
	public UserDto(String userId, String password, String userName, String address, String tel) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.address = address;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", password=" + password + ", userName=" + userName + ", address="
				+ address + ", tel=" + tel + "]";
	}
	
} // end of class
