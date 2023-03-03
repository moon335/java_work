package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	// 메인 함수
	public static void main(String[] args) {

		// 스트림 사용 -> 기반 + 보조
		// 키보드에서 값 입력 받는 거
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력: ");
		try {
			String input = reader.readLine();
			System.out.println("input: " + input);
			// 메인 쓰레드가 일하고 있다.
			while(input != null) {
				
				System.out.print("입력: ");
				input = reader.readLine();
				System.out.println("입력한 값: " + input);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	} // end of main

} // end of class
