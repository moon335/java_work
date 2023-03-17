package com.project.order.controller;

import com.project.order.dto.UserDto;
import com.project.order.service.UserService;

public class UserController {
	
	private UserService service;
	
	public UserController() {
		service = new UserService();
	}
	
	// 유저 정보 조회
	public UserDto requestUserInfo(String userId, String password) {
		UserDto responseDto = service.selectUserInfo(userId, password);
		return responseDto;
	}
	
	// 회원 가입
	public String requestSignUp(UserDto targetUser) {
		String responseSignUp = service.signUp(targetUser);
		return responseSignUp;
	}
	
	// 로그인
	public String requestSignIn(String userId, String password) {
		String responseLogin = service.signIn(userId, password);
		return responseLogin;
	}
	
} // end of class
