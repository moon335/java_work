package ch01;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainTest1 {

	public static void main(String[] args) {
		
		// Client ----> Web Server ---> dataBase
		// Client <---- Web Server <--- dataBase
		// 기본 자바표준 기술인 http 클래스를 이용하여 http 통신을 통해서
		// 데이터를 요청하고 응답 받아보는 기술을 확인해 보자
		
		// http 통신 -> 소켓통신 기반으로 만들어짐, 소켓통신은 연결이 지속되어있는 상태(커넥션 full)
		// Connectionless 통신
		
		// 프로토콜(약속)://회사주소(host 주소)/todos를 요청
		// https://jsonplaceholder.typicode.com/todos
		
		// http 통신을 위한 준비물
		// URL 클래스
		// HttpURLConnection 클래스 필요
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/3");
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			int statusCode = conn.getResponseCode();
			System.out.println("statusCode: " + statusCode);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			new InputStreamReader(conn.getInputStream());
//			conn.getInputStream(); // 한 바이트씩 데이터를 읽어 들이는 녀석

			
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			// reader.readLine()을 했을 때 null이 나오면 더 이상 읽을 데이터가 없음
			while((line = reader.readLine()) != null) {
				if(line.contains("title")) {
					sb.append(line + "\n");
				}
			}
			
			// StringBuffer를 String 타입으로 변환하는 메서드 toString()
			String resultStr = sb.toString();
			System.out.println(resultStr);
			
			// Gson 라이브러리 가지고 오고 설정하는 방법
			// gson 대표적인 사용법 및 개념
			
//			Gson gson = new Gson();
//			
//			Todo todo = new Todo();
//			
//			todo.setId((int)resultStr.charAt(14));
//			todo.setUserId(0);
//			todo.setTitle("");
//			todo.setCompleted(false);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	} // end of main

} // end of class
