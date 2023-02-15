package ch08;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		// try-catch-finally
		// finally는 언제 사용할까?
		Scanner scanner = new Scanner(System.in);
		
		try {
			int result = scanner.nextInt();			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close(); // 자원 해제 용도로도 많이 사용된다. 더이상 스캔을 받지 말라는 뜻
		}
		
		
	} // end of main
	
	
} // end of class
