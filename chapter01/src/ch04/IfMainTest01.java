package ch04;

import java.util.Scanner;

public class IfMainTest01 {

	// 메인 함수
	public static void main(String[] args) {

		// 제어문 - if
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현
		// 만약 ... 이라면

		boolean flag = true;

		// if문 단독
		// 출력이 될 수도 있고 안될 수도 있다.
		if (5 > 3) {
			System.out.println("조건식의 결과가 true 이면 여기 코드가 수행됩니다.");
		} // end of if

		// if else
		// 2개중 하나는 반드시 출력
		flag = false;

		if (flag) {
			System.out.println("true면 실행!!! ");
		} else {
			System.out.println("false이면 실행@@@");
		}

		System.out.println("성적을 입력 하시오.");
		Scanner sc = new Scanner(System.in);

		int point = sc.nextInt();

		// 문제
		// 만약 90점 이상이면 A학점 입니다 출력
		// 만약 80점 이상이면 B학점

		if (point >= 90) {
			System.out.println("학점은 A입니다.");
		} else {
			System.out.println("학점은 B입니다.");
		}

		System.out.println("===========================");

		// 40점
		if (point >= 90) {
			System.out.println("학점은 A입니다.");
		} else if (point >= 80) {
			System.out.println("학점은 B입니다.");
		} else if (point >= 70) {
			System.out.println("학점은 C입니다.");
		} else if (point >= 60) {
			System.out.println("학점은 D입니다.");
		} else {
			System.out.println("학점은 F입니다.");
		} // end of if

	} // end of main

} // end of class
