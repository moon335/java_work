package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest5 {

	public static void main(String[] args) {
		
		// 기반 + 보조 스트림 (자료형 문자 단위)
		FileReader fileReader = null;
		int count = 0;
		try {
			File file = new File("output4.txt");
			fileReader = new FileReader(file);
			// 한 줄씩 읽어라
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			// 파일에 출력하기
			FileWriter writer = new FileWriter("myText.txt");
//			writer.write(bufferedReader.read());
			// 한 줄씩 읽음
			writer.write(bufferedReader.readLine());
			writer.flush(); // flush나 close를 해야 파일에 출력됨
			
//			int i;
			// 기반 스트림을 사용 (자료 대상 - 문자열)
//			while((i = fileReader.read()) != -1) {
//				System.out.println((char)i);
//				count++;
//			}
//			bufferedReader.read();
//			while((i = bufferedReader.read()) != -1) {
//				System.out.println((char)i);
//				count++;
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("반복횟수: " + count);
		
		
		
	} // end of main

} // end of class
