package ch05;

import java.util.Scanner;

public class LeapYear {
	
	Scanner scanner = new Scanner(System.in);
	
	public String leapYear() {
		System.out.println("계산할 년도를 입력해주세요.");
		int year = scanner.nextInt();
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			return "윤년 입니다.";
		} else if(year % 4 == 0 && year % 100 == 0) {
			return "윤년이 아닙니다.";
		} else if(year % 4 == 0) {
			return "윤년입니다.";
		} else {
			return "윤년이 아닙니다.";
		}
	}
	
	
} // end of class
