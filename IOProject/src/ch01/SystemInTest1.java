package ch01;

import java.io.IOException;

public class SystemInTest1 {
	
	// main
	public static void main(String[] args) {
		
		// 키보드에서 데이터를 프로그램 안으로 넣기
		System.out.println("알파벳 하나 쓰고 Enter를 누르세요.");
		int i;
		// 한 바이트씩 키보드의 값을 입력 받아 읽어라
		try {
			// 입력
			i = System.in.read();
			
			// 출력
			System.out.println(i);
			// 컴퓨터 문자표(미리 약속) : 정수값을 문자열로 변환 --> 인코딩
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}// end of main
	
	
} // end of class
