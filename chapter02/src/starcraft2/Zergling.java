package starcraft2;

public class Zergling extends Unit {


	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
		this.maxHp = 50;
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
