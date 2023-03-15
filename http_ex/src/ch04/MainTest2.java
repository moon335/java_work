package ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainTest2 {
	
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/20");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			// http 요청할 때 2가지 방식이 있음 (GET, POST)
			conn.setRequestMethod("GET");
			conn.connect(); // 브라우저에서 주소 치고 엔터친 것과 동일
			int statusCode = conn.getResponseCode();
//			System.out.println("statusCode: " + statusCode);
			// 200 : 통신 성공, 404 : 요청한 URL이 없다.
			if(statusCode == 200) {
				// connection에 스트림이 연결됨
				// 기반 스트림 + 보조 스트림 : 데코레이션 패턴
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = null;
				
				StringBuffer sb = new StringBuffer();
				while( (line = reader.readLine()) != null) {
					sb.append(line);
				}
				String str = sb.toString();
//				 System.out.println(sb.toString());
				// JSON Parsing 써보기 -> 문자열 --> Java Object 변환
				Gson gson = new Gson();
				Todo todo = gson.fromJson(str, Todo.class);
				System.out.println("id: " + todo.getId());
				System.out.println("userId: " + todo.getUserId());
				System.out.println("title: " + todo.getTitle());
				System.out.println("Completed: " + todo.isCompleted());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	} // end of main
} // end of class
