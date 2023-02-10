package ch04;

public class MainTest01 {

	// 메인 함수
	public static void main(String[] args) {
		Bus bus = new Bus(100);
		bus.take(1); // 태우다
		bus.take(1); // 태우다
		bus.take(3); // 태우다
		bus.showInfo();

		bus.takeOff(1);
		bus.showInfo();

		Subway subway = new Subway(1);
		subway.take(3);
		subway.take(2);
		subway.take(1);
		subway.showInfo();

		subway.takeOff(3);
		subway.takeOff(1);
		subway.showInfo();

	} // end of main

} // end of class
