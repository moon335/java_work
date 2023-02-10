package ch04;

import java.util.Scanner;

public class ContinueMainTest02 {

	// 메인 함수
	public static void main(String[] args) {
		
		// 스캐너를 사용해서 사용자의 정수 값을 입력 받아서 배수의 갯수를
		// 출력하는 프로그램을 만들어 보세요.
		// 테스트 값은 1000 --> 3을 입력하면 1부터 1000 사이의 3의 배수 갯수
		Scanner sc = new Scanner(System.in);
		System.out.println("배수를 지정해 주세요.");
		int userInput = sc.nextInt();
		int count = 0;
		for(int i = 1; i < 1001; i++) {
			if(i % userInput == 0) {
				count++;
			}
			continue;
		}
		System.out.println("배수의 갯수는: " + count);

	} // end of main

} // end of class
