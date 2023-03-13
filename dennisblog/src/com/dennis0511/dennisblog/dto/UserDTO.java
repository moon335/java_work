package com.dennis0511.dennisblog.dto;

public class UserDTO {
	
	private String username;
	private String password;
	private String email;
	private String address;
	private String userRole;
	
	public UserDTO() {

	}

	public UserDTO(String username, String password, String email, String address) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", email=" + email + ", address=" + address
				+ "]";
	}
	
} // end of class
