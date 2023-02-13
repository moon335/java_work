package ch07;

import java.lang.*;

public class MainTest01 {

	// 메인 함수
	public static void main(String[] args) {
		// java.lang.*: <-- 컴파일러가 자동으로 import 해줌 (직접 작성하지 않아도 된다)
		
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "홍길동전", "허균");
		Book book3 = new Book(3, "홍길동전", "허균");
		
		String str = new String("반가워");
		
		System.out.println(str);
		// Object --> toString() 
		System.out.println(book1);
		System.out.println(book2);
		
		if(book2 == book3) {
			System.out.println("주소값이 같아요.");
		} else {
			System.out.println("주소값이 달라요.");
		}
		// equals 메서드 재정의 하기 전
		
		if(book2.equals(book3)) {
			System.out.println("주소값이 같아요.");
		} else {
			System.out.println("주소값이 달라요.");
		}
		
	} // end of main

} // end of class
