package starcraft4;

public class Zealot extends Unit implements Attack{

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}
	
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.getName() + "을 2번 공격 합니다.");
		unit.beAttacked(this.power);
		unit.beAttacked(this.power);
	}
	
} // end of class
