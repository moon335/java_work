package ch03;

public class MainTest04 {

	//메인 함수
	public static void main(String[] args) {
		
		// 증감 연산자, 감소 연산자
		// ++, -- 
		// 문법 공부할 때 (how, why)에 대한 고민을 많이 해야함
		
		int num1 = 1; // 변수의 선언과 동시에 초기화
		
		num1++;
		System.out.println(num1); // 변수의 값을 1 증가 시킬 때 사용
		// num1 += 1;
		// num1 = num1 + 1;
		
		int num2 = 1;
		num2--;
		System.out.println(num2);
		System.out.println("==============================");
		
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		// num3 값이 num4로 들어간다. 그리고 세미콜론 이후에 증감 연산자를 수행한다.
		num4 = num3++;
		System.out.println(num4);
		System.out.println(num3); // num4에 값 10을 대입하고, 세미 콜론 기준 증가 + 1
		
		// 2. 증감 연산자가 앞에 올 경우
		int num5 = 10;
		int num6;
		
		num6 = ++num5; // 세미콜론 기준으로 먼저 num5라는 변수에 접근해서 +1 증가 이후에 num6에 값을 대입한다.
		System.out.println(num6);
		System.out.println("==================================");
		
		// 감소 연산자 사용해보기 !! 앞에 있는 경우와 뒤에 있는 경우
		
		int num7 = 10;
		int num8;
		
		num8 = num7--; // 감소 연산자가 뒤에 있는 경우 먼저 num8에 num7을 대입하고 1 감소
		System.out.println(num8);
		System.out.println(num7);
		
		int num9 = 10;
		int num0;
		
		num0 = --num9; // 감소 연산자가 앞에 있는 경우 num7에서 1을 빼고 num8에 대입
		System.out.println(num0);
	} // end of main

} // end of class
