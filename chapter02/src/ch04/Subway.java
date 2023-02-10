package ch04;

public class Subway {

	// 상태
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	// 기능
	public void take(int count) {
		this.passengerCount += count;
		this.money += (1300 * count);
	}
	
	public void takeOff(int count) {
		this.passengerCount -= count;
	}
	
	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("지하철 호선 정보: " + this.lineNumber);
		System.out.println("지하철 승객 수: " + this.passengerCount);
		System.out.println("지하철 수익금: " + this.money);
	}
	
	
} //end of class
