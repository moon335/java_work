package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		// ouput3.txt
		// hello world를 찍어주세요.
		try {
			fos = new FileOutputStream("output3.txt");
			int i;
			System.out.println("알파벳 여러개를 써주세요.");
			while((i = System.in.read()) != '\n') {
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end of main
} // end of class
