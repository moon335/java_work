package ch05;

import java.util.Scanner;

public class MainTest5 {
	
	// 특정 클래스의 데이터를 가져옴
//	public Box<Book> getData() {
//		return null;
//	}
	
	// 윤년 계산하기
	// 4의 배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100의 배수이면서 400의 배수인 해는 윤년
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("계산할 년도를 입력해주세요.");
			int year = scanner.nextInt();
			if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				System.out.println("윤년 입니다.");
			} else if(year % 4 == 0 && year % 100 == 0) {
				System.out.println("윤년이 아닙니다.");
			} else if(year % 4 == 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("윤년이 아닙니다.");
			}
		}
	} // end of main
	
} // end of class
