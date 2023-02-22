package ch05;

import java.util.HashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {
	
	public static void main(String[] args) {
		
		// while 0 종료. 1. 저장, 2. 전체조회, 3. 선택조회, 4. 선택삭제, 5. 전체 삭제
		Scanner scanner = new Scanner(System.in);
		final String SAVE = "1";
		final String SELECTALL = "2";
		final String SELECTONE = "3";
		final String DELECTONE = "4";
		final String DELETEALL = "5";
		final String END = "0";
		Map<String, String> phoneNum = new HashMap<>();
		
		
//		String name = "홍길동";
//		String tel = "1234-5678";
		
		
		System.out.println(">> 기능을 선택해 주세요. <<");
		String userInput = "-1";
		while(!userInput.equals("0")) {
			System.out.println("0 종료. 1. 저장, 2. 전체조회, 3. 선택조회, 4. 선택삭제, 5. 전체 삭제");
			userInput = scanner.nextLine();
			if(userInput.equals(SAVE)) {
				System.out.println("이름을 입력해주세요.");
				String name = scanner.nextLine();
				System.out.println("전화번호를 입력해주세요.");
				String tel = scanner.nextLine();
				phoneNum.put(name, tel);
				System.out.println("저장을 완료했습니다.");
			} else if(userInput.equals(SELECTALL)) {
				if(phoneNum.isEmpty()) {
					System.out.println("전화번호부가 비어 있습니다.");
				} else {
					for(String key : phoneNum.keySet()) {
						System.out.println("이름: " + key + "\t" + "전화번호: " + phoneNum.get(key));
					}
				}
			} else if(userInput.equals(SELECTONE)) {
				System.out.println("검색할 대상의 이름을 입력해 주세요.");
				String selectName = scanner.nextLine();
				if(phoneNum.get(selectName) != null) {
					System.out.println(selectName + "의 전화번호는 " + phoneNum.get(selectName) + "입니다.");
				} else {
					System.out.println("검색할 대상이 없습니다.");
				}
			} else if(userInput.equals(DELECTONE)) {
				System.out.println("삭제할 대상의 이름을 입력해 주세요.");
				String delectName = scanner.nextLine();
				if(phoneNum.get(delectName) != null) {
					phoneNum.remove(delectName);
					System.out.println(delectName + "의 번호를 삭제했습니다.");
				} else {
					System.out.println("삭제할 대상이 없습니다.");
				}
			} else if(userInput.equals(DELETEALL)) {
				phoneNum.clear();
				System.out.println("전체 삭제 완료했습니다.");
			} else if (userInput.equals(END)) {
				System.out.println("시스템을 종료합니다.");
			} else {
				System.out.println("해당하는 번호가 없습니다. 다시 입력해주세요.");
			}
		}
		
		
	} // end of main
} // end of class
