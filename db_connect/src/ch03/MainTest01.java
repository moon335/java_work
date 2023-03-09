package ch03;

import java.util.ArrayList;

public class MainTest01 {

	public static void main(String[] args) {
		
		// 디비 접근해서 기능 수행하는 녀석은?
		EmployeeDao employeeDao = new EmployeeDao();
		
		ArrayList<EmployeeDTO> list = employeeDao.select(10007);
		
		
		System.out.println("여기는 메인");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
	} // end of main

} // end of class
