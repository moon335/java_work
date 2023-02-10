package ch02;

public class UserInfoMainTest {

	// 메인 함수
	public static void main(String[] args) {

		UserInfo user1 = new UserInfo("abcd", "Kim", "1234");

		UserInfo user2 = new UserInfo("abcd", "Hong");

		UserInfo user3 = new UserInfo("abcd");

		UserInfo user4 = new UserInfo();
		user4.userId = "abcd";
		user4.userName = "Hong";
		user4.phone = "1234";

		System.out.println(user1.userName);
		System.out.println(user1.userId);
		System.out.println(user1.phone);
		System.out.println("---------------------------");

		System.out.println(user2.userName);
		System.out.println(user2.userId);
		System.out.println(user2.phone);
		System.out.println("---------------------------");

		System.out.println(user3.userName);
		System.out.println(user3.userId);
		System.out.println(user3.phone);
		System.out.println("---------------------------");

		System.out.println(user4.userName);
		System.out.println(user4.userId);
		System.out.println(user4.phone);

	} // end of main

} // end of class
