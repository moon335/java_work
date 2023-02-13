package ch05;

public class UserInfoClient {

	static String dbName = "MYSQL";
	
	// main --> 실행하는 코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {	
		
		// 사용자한테 정보를 입력 받는다
		// String userName, String pw
		// 스캐너 활용 --> 이름 한글자 이상, pw 특수문자 포함
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		// 위에 받은 데이터를 Object 타입 변화 --> DTO
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);

		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDAO();
		} else {
			dao = new UserInfoMssqlDAO();
		}
		
		
		// 저장 기능
		dao.insertUserInfo(userInfo);
		
		
		
		
	} // end of main

} // end of class
