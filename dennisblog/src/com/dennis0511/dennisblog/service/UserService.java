package com.dennis0511.dennisblog.service;

import com.dennis0511.dennisblog.dao.UserDAO;
import com.dennis0511.dennisblog.dto.UserDTO;

public class UserService {
	
	UserDAO userDAO;
	
	public UserService() {
		userDAO = new UserDAO();
	}
	
	// 회원 가입 기능
	public String signUp(UserDTO user) {
		String msg = "";
		if(user.getUsername().equals("")) {
			System.out.println("아이디를 입력해주세요.");
			return msg;
		}
		
		user.setUserRole("USER");
		int result = userDAO.saveUser(user);
		
		return result + "";
	}
	
	// 로그인 기능 - 회원 정보 찾기
	public UserDTO login(String username, String password) {
		boolean isValid = true;
		
		if(username.equals("")) {
			isValid = false;
			System.out.println("정보를 찾을 수 없습니다.");
		} else if(password.equals("")) {
			isValid = false;
			System.out.println("정보를 찾을 수 없습니다.");
		}
		
		UserDTO dto = null;
		if(isValid) {
			dto = userDAO.selectUserInfo(username, password);
		}
		return dto;
	}
	
	// 회원 탈퇴 기능
	public String unregister(String username) {
		String msg = "";
		if(username.equals("")) {
			System.out.println("아이디가 입력되지 않았습니다.");
			return msg;
		}
		String response = userDAO.deleteUserInfo(username);
		
		return response;
	}
	
	
} // end of class
