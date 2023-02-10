package ch04;

public class ForMainTest02 {

	// 메인 함수
	public static void main(String[] args) {

		
		int num = 2;
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for
		
		System.out.println("===================================");
		
		// 이중 for문을 활용하여 2 ~ 9단 구구단을 출력해주세요.
		
		for(num = 2; num < 10; num++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			} 
			System.out.println("===================================");
		}
		
		
	} // end of main

} // end of class
