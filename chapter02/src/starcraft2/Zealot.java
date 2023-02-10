package starcraft2;

public class Zealot extends Unit {

	private int powerSum;
	private int shield;

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		maxHp = 80;
		this.shield = maxHp / 10;
		this.hp = 80 + this.shield;
		this.exp = 0;
		this.maxExp = 100;
		this.level = 1;
	}

	// 자기 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		System.out.println(this.name + "이 공격 당합니다.");
		this.hp -= power;
		powerSum += power;
		if (powerSum < this.shield) {
			System.out.println("쉴드 내구도가 줄어듭니다!");
			System.out.println("남은 쉴드: " + (this.shield - powerSum));
		} else {
			System.out.println("체력이 줄어듭니다.");
			System.out.println("현재 체력: " + this.hp);
			if (hp <= 0) {
				unitDie(this);
			}
		}
	}

	public void showInfo() {
		System.out.println("=======상태창=======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);
		System.out.println("현재 레벨: " + this.level);
		System.out.println("현재 경험치: " + this.exp + " / " + this.maxExp);
	}

} // end of class
