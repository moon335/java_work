package ex_01;

public class ex_01 {

	// 코드의 시작점 main함수
	public static void main(String[] args) {
		
		// 데이터 타입의 종류(크게 2가지)
		// 1. 기본 데이터 타입(primitive data type)
		// 2. 참조 타입(Reference Type)
		
		// 정수형(ex> 1, 10, 300) 데이터 타입
		// 크기가 다를 수 있다.
		byte b; // 1바이트 크기(8bit) -> 네모칸이 8개, 맨 앞 네모는 부호칸
		short s; // 2바이트 크기(16bit)
		int i; // 4바이트 크기(32bit)
		long l; // 8바이트 크기(64bit)
		
		// 데이터 타입 byte는 정수 127부터 -128까지 담을 수 있다.
		b = 127;
		b = -128;
		
		s = 128;
		// s = 2000000000; <- 오류
		
		// int는 약 +- 21억까지의 정수를 담을 수 있다.
		i = 2100000000;
		// i = 2200000000; <- 오류
		
		// = 기준으로 왼쪽에 있는 값을 L value 오른쪽에 있는 값을 R value라고 한다.
		// L value = R value
		// 컴퓨터 정수값의 기본 단위는 int 이다.
		l = 2200000000L; // <- 접미사를 붙여줘야 한다. (대소문자 가능)
		l = 2200000000l;
		
		// 출력해주세요
		// 문제 : short 데이터 타입의 범위는?
		System.out.println("-32,768 ~ 32,768");

	} // end of main

} // end of class
