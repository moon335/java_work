package ch06;

public class UserInfoOracleDao implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE: 저장 기능 호출");
		System.out.println("이름: " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE: 수정 기능 호출");
		System.out.println("이름: " + userInfo.getUserName());
		System.out.println("PW: " + userInfo.getPw());
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("ORACLE: 삭제 기능 호출");
		System.out.println("사용자 이름으로 삭제 기능 호출: " + userName);
	}

	@Override
	public void selecteUserInfo(String userName) {
		System.out.println("ORACLE: 조회 기능 호출");
		System.out.println("사용자 이름으로 조회 기능 호출: " + userName);

	}

}
