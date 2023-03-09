package ch03;

import java.util.ArrayList;

public interface IEmployeeDao {
	
	// c r u d
	void insert(EmployeeDTO dto);
	ArrayList<EmployeeDTO> select(int empNo);
	void select(String lastName);
	void update(String gender);
	// 오버로딩
	void delete(int empNo);
	void delete(String lastName);
	
}