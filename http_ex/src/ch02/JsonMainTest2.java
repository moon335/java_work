package ch02;

import com.google.gson.JsonObject;

public class JsonMainTest2 {
	
	public static void main(String[] args) {
		
		JsonObject jsonObject1 = new JsonObject();
		
		jsonObject1.addProperty("이름", "홍길동");
		jsonObject1.addProperty("나이", 25);
		jsonObject1.addProperty("직업", "CEO");
		jsonObject1.addProperty("취미", "노래");
		jsonObject1.addProperty("결혼여부", false);
		
		// 전체 json 문자열 확인해보기
		System.out.println(jsonObject1);
		
		// jsonObject에서 값 꺼내는 방법
		System.out.println(jsonObject1.get("취미"));
		System.out.println(jsonObject1.get("이름"));
		System.out.println(jsonObject1.get("나이"));
		System.out.println(jsonObject1.get("직업"));
		System.out.println(jsonObject1.get("결혼여부"));
		
		System.out.println("---------------------------");
		
		
		JsonObject jsonObject2 = new JsonObject();
		
		jsonObject2.addProperty("userId", 1);
		jsonObject2.addProperty("Id", 2);
		jsonObject2.addProperty("title", "quls ut nam facilis et officia qui");
		jsonObject2.addProperty("completed", false);
		
		System.out.println(jsonObject2);
		
		
	} // end of main
	
} // end of class
