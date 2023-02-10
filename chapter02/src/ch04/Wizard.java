package ch04;

// 클래스 설게 하기
public class Wizard {

	String wizardName;
	int power;
	int hp = 500;
	int mp = 1000;

	public Wizard(String wizardName, int power) {
		this.wizardName = wizardName;
		this.power = power;
	}

	public void attack() {
		System.out.println("적에게 " + this.power + " 데미지를 주었습니다.");
	}

	public void fireBall(int count) {
		this.mp -= (50 * count);
		if (mp <= 0) {
			System.out.println("마나가 부족합니다. 스킬 사용이 취소됩니다.");
		} else {
			System.out.println(wizardName + "이(가) 스킬 fireball을 사용했습니다!");
			System.out.println("적에게 2000 데미지를 주었습니다.");
			System.out.println("남은 mp: " + this.mp);
		}
	}

	public void damaged(int count) {
		this.hp -= (100 * count);
		if (hp <= 0) {
			System.out.println("캐릭터가 사망했습니다.");
		} else {
			System.out.println("적에게 공격 받았습니다!");
			System.out.println("남은 hp: " + this.hp);
		}
	}

	public void drinkPotion() {
		if (hp <= 0) {
			System.out.println("캐릭터가 사망하여 물약을 사용할 수 없습니다.");
		} else {
			this.hp += 100;
			this.mp += 50;
			System.out.println("hp와 mp를 회복했습니다.");
			System.out.println("남은 hp: " + this.hp);
			System.out.println("남은 mp: " + this.mp);
		}
	}

	public void warriorInfo() {
		System.out.println("================상태창==================");
		System.out.println("캐릭터명: " + this.wizardName);
		System.out.println("기본 파워: " + this.power);
		System.out.println("hp(health point): " + this.hp + "/ 500");
		System.out.println("mp(mana point): " + this.mp + "/ 1000");
		System.out.println("========================================");
	}

} // end of class
