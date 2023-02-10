package ch01;

public class Subway {

	// 상태
	String subwayLocation;
	String subwayNum;
	String subwayStation;
	int subwayFare;
	
	// 기능
	// 운행이 지연되다
	public void subwayDelayed() {
		System.out.println("지하철 운행이 지연되고 있다.");
	}
	
	// 사람을 태우다
	public void pickUp() {
		System.out.println("사람을 태우고 운행중이다.");
	}
	
	// 라이트를 켜다
	public void turnOnLight() {
		System.out.println("라이트를 켜다.");
	}
	
	// 문을 열다
	public void openDoor() {
		System.out.println("문을 열다.");
	}
	
	
} // end of class
