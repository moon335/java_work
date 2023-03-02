package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {
		
		// 문자 단위로 읽어 들이는 스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader("output4.txt");
			// -1
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // end of main

} // end of class
