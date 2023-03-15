package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import ch01.Todo;

public class JsonMainTest3 {

	public static void main(String[] args) {
		
		JsonArray jsonArray = new JsonArray();
		// [] <--- 찍은 상태
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "티모");
		
		System.out.println(jsonArray);
		System.out.println("--------------");
		System.out.println(jsonObject);
		
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		
		System.out.println("------------------");
		System.out.println(jsonArray);
		
		System.out.println("----------------------");
		
		JsonArray jsonArray2 = new JsonArray();
		
		JsonObject jsonObject2 = new JsonObject();
		JsonObject jsonObject3 = new JsonObject();
		JsonObject jsonObject4 = new JsonObject();
		
		jsonObject2.addProperty("userId", 1);
		jsonObject2.addProperty("id", 1);
		jsonObject2.addProperty("title", "delectus aut autem");
		jsonObject2.addProperty("completed", false);
		
		jsonObject3.addProperty("userId", 1);
		jsonObject3.addProperty("id", 2);
		jsonObject3.addProperty("title", "quis ut nam facilis et officia qui");
		jsonObject3.addProperty("completed", false);
		
		jsonObject4.addProperty("userId", 1);
		jsonObject4.addProperty("id", 3);
		jsonObject4.addProperty("title", "fugiat veniam minus");
		jsonObject4.addProperty("completed", false);
		
		jsonArray2.add(jsonObject2);
		jsonArray2.add(jsonObject3);
		jsonArray2.add(jsonObject4);
		
		System.out.println(jsonArray2);
		
		// 값을 담는 방법
		Todo todo1 = new Todo();
		
		todo1.setUserId(jsonObject2.get("userId").getAsInt());
		todo1.setId(jsonObject2.get("id").getAsInt());
		todo1.setTitle(jsonObject2.get("title").getAsString());
		todo1.setCompleted(jsonObject2.get("completed").getAsBoolean());
		
		
		// jsonArray에서 jsonObject 꺼내는 방법
		JsonObject targetJsonObject = jsonArray.get(2).getAsJsonObject();
		String strName = targetJsonObject.get("name").getAsString();
		System.out.println(strName);
		
		
		System.out.println("------------------------");
		
		// 문제 1
		
		JsonArray array1 = new JsonArray();
		
		JsonObject object1 = new JsonObject();
		JsonObject object2 = new JsonObject();
		JsonObject object3 = new JsonObject();
		
		object1.addProperty("name", "홍길동");
		object1.addProperty("age", 20);
		object1.addProperty("address", "부산");
		
		object2.addProperty("name", "이순신");
		object2.addProperty("age", 33);
		object2.addProperty("address", "서울");
		
		object3.addProperty("name", "세종대왕");
		object3.addProperty("age", 59);
		object3.addProperty("address", "세종시");
		
		array1.add(object1);
		array1.add(object2);
		array1.add(object3);
		
		System.out.println(array1);
		
		System.out.println("-----------------------");
		
		// 문제 2
		
		JsonObject todoList = new JsonObject();
		JsonArray array2 = new JsonArray();
		JsonObject person1 = new JsonObject();
		JsonObject person2 = new JsonObject();
		
		person1.addProperty("id", 1);
		person1.addProperty("title", "청소");
		person1.addProperty("complete", false);
		
		person2.addProperty("id", 2);
		person2.addProperty("title", "영어공부");
		person2.addProperty("complete", true);
		
		array2.add(person1);
		array2.add(person2);
		
		todoList.add("todoList", array2);
		todoList.addProperty("server_name", "server_1");
		
		System.out.println(todoList);
		
	} // end of main

} // end of class
