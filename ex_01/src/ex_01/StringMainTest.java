package ex_01;

public class StringMainTest {

	// 메인 함수
	public static void main(String[] args) {

		// String 문서 확인
		// String 존재하는 메서드 5가지
		// 선택해서 사용 방법과 의미, 샘플 코드 만들기
		
		String str = "TEST";
		// S가 몇 번째 index인지 출력한다.
		int indexOf = str.indexOf("S");
		System.out.println(indexOf);
		
		// 2번째 인덱스에 어떤 글자가 있는지 출력한다.
		char charAt = str.charAt(2);
		System.out.println(charAt);
		
		// format 메서드는 지정된 형식에 따라 개체의 값을 
		//문자열로 반환하여 다른 문자열에 삽입한다.
		int i = 30;
		System.out.println(String.format("%s_", str));
		System.out.println(String.format("_%d", i));
		System.out.printf("%s %s %s", str, "hi", "bye");
		
		
	} // end of main

} // end of class
