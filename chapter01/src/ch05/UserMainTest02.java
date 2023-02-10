package ch05;

import java.util.Scanner;

public class UserMainTest02 {

	// 메인 함수
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// int userInput1 = scanner.nextInt(); 
		// --> 여러개 반복되면 아래에 있는 것이 작동하지 않을 때가 있음
		// nextInt() 개행문자(엔터)를 제거하지 않았기 때문에
		// 바로 아래 코드가 실행되지 않는다.
		// 그럴땐 scanner.nextInt();를 써서 엔터키를 처리해주면 동작한다.
		
		User user1 = new User();
		System.out.println("이름을 입력해 주세요.");
		user1.name = scanner.nextLine();
		System.out.println("이메일을 입력해 주세요.");
		user1.email = scanner.nextLine();
		System.out.println("키를 입력해 주세요.");
		user1.height = scanner.nextDouble();
		System.out.println("몸무게 입력해 주세요.");
		user1.weight = scanner.nextDouble();
		System.out.println("전화번호를 입력해 주세요.");
		scanner.nextLine();
		user1.tel = scanner.nextLine();
		System.out.println("생년월일을 입력해 주세요.");
		user1.birthdate = scanner.nextInt();
		System.out.println("성별을 입력해 주세요.");
		scanner.nextLine();
		user1.gender = scanner.nextLine();
		

		System.out.println("============상태창===================");
		System.out.println("name: " + user1.name);
		System.out.println("email: " + user1.email);
		System.out.println("height: " + user1.height);
		System.out.println("weight: " + user1.weight);
		System.out.println("tel: " + user1.tel);
		System.out.println("birthdate: " + user1.birthdate);
		System.out.println("gender: " + user1.gender);
		System.out.println("===================================");

	} // end of main

} // end of class
