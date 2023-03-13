package com.tenco.blog.controller;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.service.UserService;

// main --> UserController
public class UserController {
	// main --> UserController 생성 --> 기능(회원가입(이름, 이메일..), 로그인 기능(username, pw))
	// UserController <- 사용자와 관련된 요청 코드들을 여기에다가 처리
	private UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	// 외부에서 요청한 일을 수행하고 결과를 리턴한다.
	// 사용자 정보를 받아 회원 가입 처리를 한다.
	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원 가입이 안됩니다.";
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}
	
	public UserDTO requestSignIn(String username, String password) {
		UserDTO responseUserDTO = userService.checkUser(username, password);
		
		return responseUserDTO;
	}
	
	
} // end of class
