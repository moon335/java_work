package ch04;

import java.util.Scanner;

public class WhileMainTest01 {

	// 메인 함수
	public static void main(String[] args) {

		// 1 ~ 10 연산 코드
		int num = 1;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 수를 입력하세요.");
		int userInput = sc.nextInt();

		while (num <= userInput) {
			System.out.println("현재 값: " + num); // 무한 루프에 조심
			sum += num;
			num++;
		};
		System.out.println("연산에 대한 결과 값은: " + sum);

	} // end of main

} // end of class
