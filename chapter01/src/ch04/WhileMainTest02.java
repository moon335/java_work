package ch04;

import java.util.Scanner;

public class WhileMainTest02 {

	// 메인 작업자
	public static void main(String[] args) {

//		do {
//			
//		} while (조건식);
		// 사용자가 0을 입력하면 프로그램을 종료하는 코드를 만들어 주세요.
		System.out.println("값을 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		int userInput = -1;
		
		int num = 1;
		int sum = 0;
		do {
			// 조건에 관계 없이 한번은 수행되는 반복문
			// 한번 코드를 수행하고
			// 다시 사용자 입력 값을 받고 싶다면
			userInput = sc.nextInt();
			if(userInput == 0) {
				// break;
				num = 11;
				System.out.println("프로그램을 종료합니다.");
			} else {
				sum += userInput;
				System.out.println("연산된 값: " + sum);
				System.out.println("값을 입력해 주세요.");
			}
		} while(true);
//		} while(num >= 10);
		//       1  >= 10 --> 거짓이라 출력되지 않아야 하지만 한번은 반드시 수행
		

		
		
		
//		while(true) {
//			System.out.print("-");
//			
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {
//				
//			}
//			
//		} // end of while

		// 작업자 힘드니까 1초 잠들어

	} // end of main

} // end of class
