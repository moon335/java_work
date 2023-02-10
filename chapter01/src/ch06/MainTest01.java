package ch06;

public class MainTest01 {

	// 1. 리턴값이 int, 매개변수 n1, n2, n3 이름이 intAdd
	// 2. 리턴값이 double 매개변수 n1, n2 이름은 doubleAdd
	// 3. 리턴값이 void, 매개변수는 String article, 함수 이름은 printArticle

	static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}

	static double doubleAdd(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}

	static void printArticle(String article) {
		System.out.println(article);
	}

	// 테스트 - 실행코드 main
	public static void main(String[] args) {
		System.out.println(intAdd(5, 10, 15));

		System.out.println(doubleAdd(12.3, 10.5));

		printArticle("반가워");
	} // end of main
} // end of class
