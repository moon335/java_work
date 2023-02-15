package ch08;

public class MainTest2 {

	// 메인 함수
	public static void main(String[] args) {

		// 예외 처리 구문 작성
		// 10 / 0 연산 시키고 예외 처리까지 작성해주세요.
		// 1. try
		int i = 10;
		int j = 0;

		try {
			int result = i / j;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}

		// 2. 클래스 설계 throws 활용
		Calculator calculator = new Calculator(10, 0);
		
		try {
			calculator.calNum();
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}

	} // end of main

} // end of class

// throws는 클래스 설계

class Calculator {
	private int i;
	private int j;
	
	public Calculator(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int calNum() throws ArithmeticException{
		
		int cal = i / j;
		
		return cal;
	}
} // end of class
