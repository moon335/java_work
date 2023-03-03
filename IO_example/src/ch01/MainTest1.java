package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest1 {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Writer writer = new Writer(reader);
		
		
		try {
			System.out.println("입력: ");
			reader.readLine();
			writer.run();
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


class Writer extends Thread {
	
	BufferedWriter writer = null;
	BufferedReader reader;
	
	public Writer(BufferedReader reader) {
		this.reader = reader;
		try {
			writer = new BufferedWriter(new FileWriter("output2.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public void run() {
		try {
			writer.write(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
} // end of class
