package ch05;

import java.util.ArrayList;

public interface IEmployeeDAO {
	
	// 해당 직함의 이름을 입력 받아 직원 이력을 출력
	
	ArrayList<EmployeeDTO> showTitleEmpInfo(String title);
	
	// 풀 네임을 받아 직업의 연봉 받은 횟수를 반환하는 기능을 만들어주세요.
	
	ArrayList<EmployeeDTO> salaryCount(String firstName, String lastName);
	
	// insert
	int insert(EmployeeDTO dto);
	
	// 조회
	ArrayList<EmployeeDTO> select();
	
	// 삭제
	int delete(String empNo);
	
	// 수정
	int update(String targetEmpNo, EmployeeDTO dto);
	
} // end of interface
