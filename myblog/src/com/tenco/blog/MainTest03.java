package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.BlogDTO;
import com.tenco.blog.dto.UserDTO;

public class MainTest03 {

	public static void main(String[] args) {
		
		// 사용자 여부 확인
		UserController userController = new UserController();
		BlogController blogControllar = new BlogController();
		UserDTO loginUser = userController.requestSignIn("이춘향", "3478");
		System.out.println(loginUser);
		
		// Main에서 controller에게 무엇을 넘겨야 하는가
		// 해당 개시글의 pk 값을 알아야 한다.
		// 사용자에 대한 정보도 필요하다 (userId)
		blogControllar.requestBoardDelete(5, loginUser.getId());
		
//		BlogDTO dto = blogControllar.requestBoardSelect(3);
//		
//		System.out.println(dto.getId());
//		System.out.println(dto.getTitle());
//		System.out.println(dto.getContent());
//		System.out.println(dto.getReadCount());
//		System.out.println(dto.getUserId());
		
		
		
		
	}

}
