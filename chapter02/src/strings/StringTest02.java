package strings;

public class StringTest02 {

	// 메인 함수
	public static void main(String[] args) {
		// 상수 풀이라는 개념을 이해 하였다.
		// 실제 주소값을 찍어 보자 !!!
		// Student sKim = new Student();
		// System.out.println(sKim); <--- 주소값이 찍혔음
		// Object 클래스 일 때 확인
		
		String str1 = "반가워"; // 1번 방식 -> 상수 풀 영역에 올라간다.
		String str2 = new String("반가워"); // 2번 방식 -> 동적 메모리 영역(heap 메모리)에 올라간다.
		String str3 = new String("반가워"); 
		String str4 = "반가워";
		
		// 현재 string 주소값을 찍어 보는 방법
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		// 상수 풀에 한번 생성된 문자열은 불변(immutable)이다.
		str4 = str4 + " 홍길동";
		System.out.println(System.identityHashCode(str4));
		str1 += " : 하이";
		System.out.println(System.identityHashCode(str1));
		// 상수 풀 영역에 한번 생성된 문자열 값은 변경이 불가능 하다.
		// str1 += " : 하이" : <-- 새로 생성된다, 상수 풀 영역에 !!!
		
		// 가, 나, a, 가 다 마 마 <-- 계속 상수 풀 영역의 메모리를 사용한다.
		// 그래서 메모리를 효율적으로 사용하기 위해서는
		// StringBuilder 클래스와, StringBuffer 클래스를 알아야 한다.
		
		
	} // end of main

} // end of class
