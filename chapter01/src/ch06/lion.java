package ch06;
/**
 * 
 * 함수를 선언하는 코드 방법
 * 함수를 사용하는 코드 방법
 *
 */
public class lion {

	//     int는 리턴타입 -> 함수를 실행했을 때 int타입으로 받음
	// 함수의 선언부
	// 정수를 반환하는 함수
	// 함수를 설계하는 코드 작성
	static int addNumber (int n1, int n2) {
		//함수의 구현부(body)
		int result; // 지역변수
		result = n1 + n2;
		return result; // 실행의 제어권을 반납한다. -> 호출당한 곳으로 다시 돌아감.
	}
	
	// 아무 값도 반환하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println(name + " 반갑습니다~");
	}
	
	static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	// clacSum2, 정수값 3개를 받아서 덧셈 연산 후 결과를 반환 하시오.
	
	static double calcSum2(double d1, double d2, double d3) {
		double result;
		result = d1 + d2 + d3;
		return result;
	}
	
	// calcSum3 정수값 1, 실수값 1, 논리값 1개를 받고 식을 만들어서
	// "정수값: " [], 실수값 [], 논리값 [] <--- 문자열로 연산하고
	// 리턴 타입은 String을 만들어 주세요.
	static String calcSum3(int s1, double s2, boolean s3) {
		System.out.println("정수값: " + s1);
		System.out.println("실수값: " + s2);
		System.out.println("논리값: " + s3);
		
		return "";
	}
	
	
	// 메인 함수 - 텅빈, 리턴값이 없다.
	public static void main(String[] args) {
		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber: " + myNumber);
		
		// 함수 호출2
		// 함수 호출할 때는 모양 맞추기다.
		sayHello("애쉬");
//		int a = myNumber;
		sayHello("티모");
		sayHello("바론");
		
		int calResult = calcSum(); // <---
		System.out.println(calResult);
		
		System.out.println( calcSum() );
		
		double calResult2 = calcSum2(1, 5, 12);
		System.out.println(calResult2);
		
		calcSum3(2, 12.5, false);
		
	} // end of main
	
	// 함수란?
	// 자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 일련의 코드 묶음이다.
	
} // end of class
