package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {

	
	public static void main(String[] args) {
		
		DBClient client = new DBClient();
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String queryStr = "select * from student";
			
			ResultSet rs = stmt.executeQuery(queryStr); // 결과를 rs에 담는다.
			// 결과를 뽑는 기술
			while(rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String grade = rs.getString("grade");
				int schoolId = rs.getInt("school_id");
				System.out.print("id : " + id + "\t");
				System.out.print("name : " + name + "\t");
				System.out.print("grade : " + grade + "\t");
				System.out.print("schoolId : " + schoolId);
				System.out.println();
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//
		}
		
		
	} // end of main

} // end of class
