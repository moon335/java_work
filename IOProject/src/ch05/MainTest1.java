package ch05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("output3.txt");
			// 보조 스트림 연결
			BufferedOutputStream bis = new BufferedOutputStream(fos);
			bis.write(97);
			bis.write(98);
			bis.write(99);
			bis.flush(); // 물을 내리다
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
