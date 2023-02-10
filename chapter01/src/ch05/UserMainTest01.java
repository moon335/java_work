package ch05;

public class UserMainTest01 {

	// 메인 함수
	public static void main(String[] args) {

		User user1 = new User();
		user1.name = "김현우";
		user1.email = "dennis0511@naver.com";
		user1.height = 170;
		user1.weight = 52;
		user1.tel = "010-3188-2868";
		user1.birthdate = 970615;
		user1.gender = "male";

		System.out.println(user1.name);
		System.out.println(user1.gender);
		System.out.println(user1.birthdate);
		System.out.println(user1.tel);
		System.out.println(user1.email);
		System.out.println(user1.height);
		System.out.println(user1.weight);

	} // end of main

} // end of class
