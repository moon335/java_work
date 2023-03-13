package com.dennis0511.dennisblog.dao;

import com.dennis0511.dennisblog.dto.UserDTO;

public interface IUserDAO {
	
	// 유저 정보 저장 기능(회원가입)
	int saveUser(UserDTO user);
	
	// 로그인 기능
	UserDTO selectUserInfo(String username, String password); 
	
	// 회원탈퇴 기능
	String deleteUserInfo(String username);
	
} // end of interface
