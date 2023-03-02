package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream4 {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		// 파일이 없다면 FileOutputStream은 파일을 먼저 생성해준다.
		try {
			byte[] bs = new byte[26];
			byte myData = 65;
			// 파일명 뒤에 true를 사용하면 추가적으로 글을 쓰는 동작을 한다.
			// false일 경우 기존에 있던 정보는 삭제됨
			fos = new FileOutputStream("output4.txt", true);
			// 파일에 A부터 Z까지 알파벳을 입력하고 싶음
			// 반복 횟수 - for
			for(int i = 0; i < bs.length; i++) {
				// 65 - A, 66 - B
				// fos.write(myData);
				bs[i] = myData;
				myData++;
			}
			fos.write(bs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	} // end of main
} // end of class
