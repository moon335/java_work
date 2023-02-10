package ch07;

public class Bus {

	private int busNum;
	private int money;
	private int passengerCount;
	private final int price;
	
	public Bus(int busNum) {
		this.busNum = busNum;
		price = 1000;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void take() {
		this.money += 1000;
		this.passengerCount++;
	}
	
}
