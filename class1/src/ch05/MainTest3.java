package ch05;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {

	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장해주세요.
		// key 값은 중복될 수 없다.
		// 1 - String, String
		// 2 - String, Object(Person)
		Map<String, String> telNum = new HashMap<>();
		telNum.put("홍길동", "010-1523-2345");
		telNum.put("이순신", "010-3456-4567");
		telNum.put("티모", "010-1258-7890");
		telNum.put("홍길동", "010-1523-2345");
		
		System.out.println(telNum);
		String phoneNum = telNum.get("홍길동");
		System.out.println(phoneNum);
		
		
		
		
	} // end of main

} // end of class
