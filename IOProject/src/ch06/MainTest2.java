package ch06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("myText2.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeChar('B');
			dos.writeInt(80);
			dos.writeFloat(3.14f);
			
			
			fis = new FileInputStream("myText2.txt");
			DataInputStream dis = new DataInputStream(fis);
			dis.readChar();
			dis.readInt();
			dis.readFloat();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	} // end of main

} // end of class
