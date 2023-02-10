package ch11;

public class ToyCar extends Goods {
		
	public ToyCar() {
		name = "장난감 자동차";
		color = "blue";
	}
	
	public void go() {
		System.out.println("차가 달리고 있다.");
	}
	
	public void stop() {
		System.out.println("차가 멈추었다.");
	}
	
	public void fillUp() {
		System.out.println("차에 기름을 채웠다.");
	}
	
}
