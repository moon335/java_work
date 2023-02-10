package ch07;

public class Subway {

	private int lineNum;
	private int money;
	private int passengerCount;
	private final int price;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
		price = 1200;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void take() {
		this.money += 1200;
		this.passengerCount++;
	}
	
}
