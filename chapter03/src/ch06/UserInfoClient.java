package ch06;

import java.util.Scanner;

public class UserInfoClient {

	static String dbName = "ORACLE";

	// main --> 실행하는 코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {

		// UserInfoOracleDao 만들어주세요
		// 스캐너를 통해서 사용자 이름, 사용자 비번을 입력 받기

		// 흐름 만들기
		// 1. 저장기능, 2. 수정기능
		// dbName 변경해가면서 코드 동작 확인해주세요.
		Scanner scanner = new Scanner(System.in);

		System.out.println("사용자 이름을 입력해 주세요.");
		String userName = scanner.nextLine();
		System.out.println("사용자 비번을 입력해 주세요.");
		String userPw = scanner.nextLine();
		boolean flag = true;
		final String SAVE = "1";
		final String UPDATE = "2";
		final String TURNOFF = "0";

		UserInfo userInfo = new UserInfo(userName, userPw);

		IUserInfoDao dao = null;
		if (UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDAO();
		} else if (UserInfoClient.dbName.equals("MSSQL")) {
			dao = new UserInfoMssqlDAO();
		} else if (UserInfoClient.dbName.equals("ORACLE")) {
			dao = new UserInfoOracleDao();
		}
		
		while (flag) {
			System.out.println("0. 시스템 종료 1. 저장기능 2. 수정기능 중에 선택해주세요.");
			String userInput = scanner.nextLine();
			if (userInput.equals(SAVE)) {
				System.out.println("유저 정보를 저장합니다.");
				dao.insertUserInfo(userInfo);
			} else if (userInput.equals(UPDATE)) {
				System.out.println("유저 정보를 수정합니다.");
				dao.updateUserInfo(userInfo);
			} else if (UserInfoClient.dbName.equals("ORACLE")) {
				System.out.println("유저 정보를 수정합니다.");
				dao.updateUserInfo(userInfo);
			} else if (userInput.equals(TURNOFF)) {
				System.out.println("시스템을 종료 합니다.");
				flag = false;
			}
		}

	} // end of main

} // end of class
