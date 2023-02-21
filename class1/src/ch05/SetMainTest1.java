package ch05;

import java.util.HashSet;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class SetMainTest1 {
	
	// 메인 함수
	public static void main(String[] args) {
		
		// 순서가 없고 중복 불가
		Set<Integer> set1 = new HashSet<>();
		// 값을 추가하는 방법(특징 기억)
		set1.add(1);
		set1.add(10);
		set1.add(100);
		set1.add(500);
		set1.add(1);
		set1.add(1);
		
		System.out.println(set1.toString());
		System.out.println(set1.size());

		System.out.println("----------------");
		// 삭제하는 방법
		set1.remove(500);
		set1.remove(1000); // 없는 요소를 삭제 요청하더라도 오류 발생하지 않음
		 set1.clear(); // 요소 전체 삭제
		System.out.println(set1.toString());
		System.out.println(set1.size());
		
		// Set 계열을 반복문 처리할 때 Iterator 타입으로 변환해서 처리할 수 있다.
		Iterator<Integer> iter = set1.iterator(); // 형 변환
		// hasNext(), next();
//		try {
//			System.out.println("next 사용1: " + iter.next());
//			System.out.println("next 사용2: " + iter.next());
//			System.out.println("next 사용3: " + iter.next());
//		} catch (NoSuchElementException e) {
//			System.out.println("자료구조 안에 값이 없어");
//		}
		while(iter.hasNext()) {
			System.out.println("next 사용: " + iter.next());
		}
		
		
	} // end of main
	
} // end of class
