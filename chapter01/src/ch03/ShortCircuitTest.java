package ch03;

public class ShortCircuitTest {

	// 메인 함수
	public static void main(String[] args) {
		// 관계 논리곱 --> F --> F, 논리합 --> T -- > T

		int num1 = 5;
		int i = 0;

		// F && T
//		boolean value = ( (num1 += 10) < 10 ) && ( (i += 2) < 10 );
		boolean value = ((num1 += 10) > 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println("============================");

		System.out.println(num1);
		// 논리곱을 할 때 앞의 값이 F이면 이미 결과가 F이기 때문에 뒤 식은 연산을 하지 않고 결과 출력 -->short circuit evaluation
		System.out.println(i);
		System.out.println("=============================");

		// F || T
		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println(i);
		System.out.println("============================");

		// 문제

		// 문제 shotrCircuit 평가 문제를 직접 2문제 만들어 주세요
		// 그리고 카페 도전과제 -> 실습 및 리뷰에 문제 & 답을 올려주세요.
		// 다음 코드를 실행했을 때 결과값과 j값을 구하시오.

		int num2 = 5;
		int j = 0;

		// 15 > 20 -> F --> 뒷 항은 계산하지 않음
		value = ((num2 += 10) > (j += 20)) && ((j += 20) < 30);
		System.out.println(value); // --> flase
		System.out.println(j); // --> 왼쪽에서 계산한 값만 적용해서 20

		System.out.println("===================================");

		// 0 > 10 -> F || 5 > 0 -> T --> 논리합은 둘 중 하나만 참이면 참이기 때문에 앞 항이 F지만 뒷 항까지 계산
		value = ((num2 -= 15) > 10) || ((j += 5) > 0);
		System.out.println(value); // --> true
		System.out.println(j); // 20 + 5를 계산하면 25가 나온다.

	} // end of main

} // end of class
