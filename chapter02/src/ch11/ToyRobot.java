package ch11;

public class ToyRobot extends Goods {
	
	public ToyRobot() {
		name = "로봇";
		color = "gold";
	}
	
	public void transForm() {
		System.out.println("로봇이 변신을 했습니다.");
	}
	
	public void fight() {
		System.out.println("로봇이 적과 싸우고 있습니다.");
	}
	
}
