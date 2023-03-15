package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainTest3 {

	public static void main(String[] args) {
		
		// URL
		// ...I/O
		// POST <- 단 ch01 패키지에서 만들기
		// 값을 담았다면 콘솔창에 출력
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/posts/19");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("POST");
			conn.connect();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // end of main

} // end of class
