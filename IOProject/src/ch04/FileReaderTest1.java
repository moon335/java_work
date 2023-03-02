package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		
		// 문자 단위로 읽어 들이는 스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader("output4.txt");
			int temp = fr.read();
			// char로 형변환 하더라도 글자가 깨지지 않음
			System.out.println("temp: " + (char)temp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // end of main

} // end of class
