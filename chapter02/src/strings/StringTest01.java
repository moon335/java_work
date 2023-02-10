package strings;

public class StringTest01 {

	public static void main(String[] args) {

		// 문자열이라는 데이터를 사용할 때

		String str1 = "반가워"; // 1번 방식 -> 상수 풀 영역에 올라간다.
		String str2 = new String("반가워"); // 2번 방식 -> 동적 메모리 영역(heap 메모리)에 올라간다.
		String str3 = new String("반가워"); 
		String str4 = "반가워"; // "" 안에 있는 글자와 같은것이 있는지 확인하고 있다면 원래 있던 주소값을 던져준다.
		
		
		// 값을 출력해 보자
		System.out.println("str1" + str1);
		System.out.println("str2" + str2);
		
		// 1번 방식과 2번 방식은 메모리 위치 시키는 곳이 다르다.
		// == // -> 기본 데이터 타입은 값을 비교, 참조 타입은 주소값을 비교
		
		// 검증하기
		if(str1 == str2) {
			System.out.println("주소값이 같아요.");
		} else {
			System.out.println("아니요 주소값이 달라요.");
		}
		System.out.println("------------------------------");
		// 검증하기2
		if(str2 == str3) {
			System.out.println("주소값이 같아요.");
		} else {
			System.out.println("아니요 주소값이 달라요.");
		}
		System.out.println("------------------------------");
		// 검증하기3
		if(str1 == str4) {
			System.out.println("주소값이 같아요.");
		} else {
			System.out.println("아니요 주소값이 달라요.");
		}
		
		// 결론 : 리터럴 값으로 생성한 문자열은 상수 풀 이라는 영역에 올라가고
		// 동일한 문자열을 사용한다면 새로 생성하지 않고 재활용 하여 사용한다.
		System.out.println("------------------------------");
		// 검증하기4
		if(str1.equals(str2)) {
			System.out.println("문자열 모양이 같아요.");
		} else {
			System.out.println("아니요. 문자열 모양이 달라요.");
		}
		
		// 
		
		
	} // end of main

} // end of class
