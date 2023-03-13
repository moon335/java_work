package com.dennis0511.dennisblog.controller;

import com.dennis0511.dennisblog.dto.UserDTO;
import com.dennis0511.dennisblog.service.UserService;

public class UserController {
	
	UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	// 외부 인원은 회원가입을 받지 않는다.
	public String requestSignUp(UserDTO user, String host) {
		String result = "외부인원은 회원가입 할 수 없습니다.";
		if(host.equals("localhost")) {
			result = userService.signUp(user);
		}
		return result;
	}
	
	// 로그인 기능 구현해보기
	public UserDTO requestLogin(String username, String password) {
		
		UserDTO dto = userService.login(username, password);
		
		return dto;
	}
	
	public String requestUnregister(String name) {
		
		String response = userService.unregister(name);
		
		return response;
	}
	
	
} // end of class
