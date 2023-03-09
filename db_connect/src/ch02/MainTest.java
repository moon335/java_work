package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest {

	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		DBClient client = new DBClient();
		Connection conn = client.getConnection();
		try {
			Statement stmt = conn.createStatement();
			// 쿼리문 생성, 실행
			String queryStr = "select * from student";
			
			ResultSet rs = stmt.executeQuery(queryStr); // 결과를 rs에 담는다.
			// 결과를 뽑는 기술
			while(rs.next()) {
				Student student = 
						new Student(rs.getInt("student_id"), rs.getString("student_name"),
								rs.getString("grade"), rs.getInt("school_id"));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			System.out.println(list.get(i).getName());
		}
		
	} // end of main

} // end of class

/*
 *  int id = rs.getInt("student_id");
	String name = rs.getString("student_name");
	String grade = rs.getString("grade");
	int schoolId = rs.getInt("school_id");
 */


class Student {
	
	private int id;
	private String name;
	private String grade;
	private int schoolId;
	
	public Student(int id, String name, String grade, int schoolId) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.schoolId = schoolId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", schoolId=" + schoolId + "]";
	}
	
}
