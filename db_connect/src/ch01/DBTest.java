package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	// 준비물
	// 자바 코드에서 mysql 서버로 접속을 해야하기 때문에 필요 사항
	// 계정 정보, 비밀번호
	// 접속 경로 : URL(주소)
	// mysql 연결 주소
	// "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	//   프로토콜 //자기자신:3306포트/데이터베이스이름?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
	
	private static final String USERNAME = "root";
	private static final String PASSWORLD = "1234"; // 본인 비밀번호 작성
	private static final String URL = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	
	// DB 접근 기술 - 필요한 클래스들이 있다.
	private static Connection connect; // DB 커넥션 연결 객체
	static Statement stmt; // 문자열들을 SQL로 변경하거나 명령문을 실행 시켜주는 객체
	static ResultSet rs; // 결과집합
	
	public static void main(String[] args) {
		
		// 드라이버를 로드 해야한다. - 컴파일 시점에 선언해서 사용하는 방법이 아닌 동적 로딩
		// 동적 로딩 -> 실행시에 객체를 메모리에 올리는 것을 말한다.
		try {
			// 클래스가 없을 수도 있음
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Driver <- 동작을 시켜야 함
			// Driver -> 커넥션 객체를 만들어줌
			connect = DriverManager.getConnection(URL, USERNAME, PASSWORLD);
			// 연결 객체에서 Statement 녀석을 뽑아 낼 수 있음.
			stmt = connect.createStatement();
			
			String sql = "select * from userTBL";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String userName = rs.getString("userName");
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");
				System.out.println(userName + "," + birthYear + "," + addr + "," + mobile);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	} // end of main

} // end of class
