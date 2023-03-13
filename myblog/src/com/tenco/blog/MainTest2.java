package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest2 {

	// 메인 함수
	public static void main(String[] args) {
		
		// UserDTO dto = new UserDTO("이춘향", "3478", "c@naver.com", "부산시 동구");
		UserController userController = new UserController();
		
		// 로그인 성공
		UserDTO loginUser = userController.requestSignIn("이춘향", "3478");
		System.out.println("userId: " + loginUser.getId());
		
		// id title content readCount userId
		// title, content, userId -> String으로 하나씩 지정, 클래스를 만들어서 넘기기
		
		BlogController blogControllar = new BlogController();
		
		if(loginUser.getId() != 0) {
			int response = blogControllar.reqSaveBoard("MVC 패턴의 이해2", "Model-View-Controller", loginUser.getId());
			if(response == 0) {
				System.out.println("글쓰기에 실패하였습니다.");
			} else {
				System.out.println("글쓰기에 성공하였습니다.");
			}
		}
		
		
	} // end of main

} // end of class
