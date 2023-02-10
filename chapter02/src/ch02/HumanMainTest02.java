package ch02;

import java.util.Scanner;

public class HumanMainTest02 {

	// 메인 함수
	public static void main(String[] args) {

		
		Human human = new Human();
		// 스캐너를 활용해서 값을 할당해 주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		human.name = sc.nextLine();
		System.out.println("키 입력하세요.");
		human.height = sc.nextInt();
		System.out.println("몸무게 입력하세요.");
		human.weight = sc.nextInt();
		System.out.println("당신은 남자입니까? (true, false)");
		human.isMan = sc.nextBoolean();
		System.out.println("0을 눌러 상태창을 출력하세요.");
		int i = sc.nextInt();
		if(i == 0) {
			human.showInfo();
		}
		
		// human.showInfo();
		
		
		
		
		
		// 심화 0번 입력시에 showInfo 호출
		// 스캐너를 통해서 showInfo 메서드 호출 기능 만들어보기
		// 마지막에는 showInfo 메서드 호출해서 값을 확인해 주세요.
		
		
	} // end of main

} // end of class
