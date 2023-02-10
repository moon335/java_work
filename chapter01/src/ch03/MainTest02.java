package ch03;

public class MainTest02 {

	// 코드 시작점은 main 함수
	public static void main(String[] args) {

		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = 5 / 3;
		// int number4 = 5.0 / 3.0; --> 오류 / 오른쪽 값이 double값이기 때문 -> (int)(5.0 / 3.0)로
		// 변환시키면 제대로 출력
		// double number4 = 5 / 3; --> 결과가 1.0으로 나옴 오른쪽 값이 정수의 기본형인 int형이라 1.0으로 출력
		// double number4 = (double)5 / (double)3; --> 양쪽 다 double형이기 때문에 1.6666667이 출력
		int number5 = 5 % 3;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4); // 1.666666666이지만 형 변환으로 1만 나옴
		System.out.println(number5);

		System.out.println("============================");

		// 문제
		// 1 (12 + 3) / 3 을 화면에 출력하시오.
		int i = (12 + 3) / 3;
		System.out.println(i);
		// 2. (25 % 2) 값을 화면에 출력하시오.
		int j = (25 % 2);
		System.out.println(j);
		// 3. 3.0 / 5를 정수값 result 변수에 담아주세요.
		int result = (int) (3.0 / 5);
		System.out.println(result);
	} // end of main

} // end of class
