package ch07;

public class StudentMainTest {

	// 메인 함수
	public static void main(String[] args) {

		Student James = new Student("James", 5_000);
		Student Tomas = new Student("Tomas", 10_000);
		Student Edward = new Student("Edward", 20_000);
		
		Bus bus = new Bus(100);
		Subway subway = new Subway(1);
		Texi texi = new Texi("카카오택시");
		
		James.takeBus(bus);
		Tomas.takeSubway(subway);
		Edward.takeTexi(texi);
		
		
		
	} // end of main

} // end of class
