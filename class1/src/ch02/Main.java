package ch02;

public class Main {
	
	// 메인 함수
	public static void main(String[] args) {
		
		Address address = new Address("해운대구 좌동 123", "부산", "롯데 103호", "456-123");
		Person person = new Person("홍길동", 10, address);
		
		
		System.out.println("name: " + person.getName());
		System.out.println("Address: " + person.getAddress().getCity());
		// Person 클래스에서 Address를 참조 할 수 있다.
		// Address클래스는 Person 클래스를 참조 할 수 없다.
		
	} // end of main
	
} // end of class
