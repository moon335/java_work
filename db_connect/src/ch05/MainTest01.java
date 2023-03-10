package ch05;

import java.util.ArrayList;

public class MainTest01 {

	
	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
//		ArrayList<EmployeeDTO> tempList = employeeDAO.showTitleEmpInfo("Staff");
//		for (int i = 0; i < tempList.size(); i++) {
//			String empNo = tempList.get(i).getEmpNo();
//			String firstName = tempList.get(i).getFirstName();
//			String title = tempList.get(i).getTitle();
//			
//			System.out.println("empNo: " + empNo);
//			System.out.println("firstName: " + firstName);
//			System.out.println("title: " + title);
//		}
//		ArrayList<EmployeeDTO> tempList = employeeDAO.salaryCount("Georgi", "Facello");
//		for (int i = 0; i < tempList.size(); i++) {
//			String firstName = tempList.get(i).getFirstName();
//			String lastName = tempList.get(i).getLastName();
//			String count = tempList.get(i).getCount();
//			
//			System.out.println("firstName: " + firstName);
//			System.out.println("lastName: " + lastName);
//			System.out.println("연봉 받은 횟수: " + count);
//			System.out.println("------------------------");
//		}
		employeeDAO.insert(new EmployeeDTO("2", "2023-01-02", "Lee", "hyoju", "F", "2023-12-11"));
		
	} // end of main

} // end of class
