package ch12;

public abstract class Computer {
	
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void turnOff() {
		System.out.println("전원이 꺼졌습니다.");
	}
	
	
}
