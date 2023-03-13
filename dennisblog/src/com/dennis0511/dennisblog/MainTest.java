package com.dennis0511.dennisblog;

import com.dennis0511.dennisblog.controller.UserController;
import com.dennis0511.dennisblog.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {
		
//		UserDTO dto = new UserDTO("이순신", "1234", "d@naver.com", "부산시 서구");
		
		UserController controller = new UserController();
//		controller.requestSignUp(dto, "localhost");
		
//		UserDTO result = controller.requestLogin("이순신", "5678");
//		
//		if(result != null) {
//			System.out.println("로그인에 성공했습니다.");
//			System.out.println(result);
//		} else {
//			System.out.println("로그인에 실패했습니다.");
//		}
		
		String response = controller.requestUnregister("이순신");
		
		if(response.equals("1")) {
			System.out.println("탈퇴가 완료되었습니다.");
		} else {
			System.out.println("탈퇴에 실패했습니다.");
		}
		
	} // end of main

} // end of class
