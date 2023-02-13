package ch07;

public class StudentMainTest {

	// 메인 함수
	public static void main(String[] args) {
		Student student1 = new Student("허균");
		Student student2 = new Student("허상");
		Student student3 = new Student("허균");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		if(student1.equals(student3)) {
			System.out.println("동명이인이 맞습니다.");
		} else {
			System.out.println("동명이인이 아닙니다.");
		}
		
	} // end of main

} // end of class
