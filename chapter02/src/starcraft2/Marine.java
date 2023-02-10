package starcraft2;

/**
 * @author 김현우
 */

public class Marine extends Unit {

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
		this.maxHp = 70;
		this.exp = 0;
		this.maxExp = 100;
		this.level = 1;
	}

	public void showInfo() {
		System.out.println("=======상태창=======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp + " / " + this.maxHp);
		System.out.println("현재 경험치: " + this.exp + " / " + this.maxExp);
	}

} // end of class
