package com.project.order.service;

import com.project.order.dao.UserDao;
import com.project.order.dto.UserDto;

public class UserService {
	
	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	
	// 정보 조회 로직 구현
	public UserDto selectUserInfo(String userId, String password) {
		boolean isValid = true;
		if(userId.equals("") || password.equals("")) {
			isValid = false;
		}
		UserDto resultDto = null;
		if(isValid == true) {
			resultDto = userDao.select(userId, password);
		}
		return resultDto;
	}
	
	// 회원가입을 위한 로직 구현
	public String signUp(UserDto targetUser) {
		String dupId = userDao.select(targetUser.getUserId()).getUserId();
		String result = "회원가입에 실패했습니다.";
		if(targetUser.getUserId().equals("")) {
			return result;
		}
		int resultRow = userDao.insert(targetUser);
		if(resultRow != 0) {
			result = "회원가입에 성공했습니다.";
		} else if(targetUser.getUserId().equals(dupId)) {
			result = "중복된 아이디가 존재합니다.";
		}
		return result;
	}
	
	// 로그인을 위한 로직 구현
	public String signIn(String userId, String password) {
		UserDto targetUser = selectUserInfo(userId, password);
		String login = "";
		if(targetUser.getUserId() == null) {
			login = "아이디와 비밀번호를 확인해주세요.";
		} else if(targetUser.getUserId().equals(userId) && targetUser.getPassword().equals(password)) {
			login = "로그인에 성공했습니다.";
		}
		return login;
	}
	
} // end of class
