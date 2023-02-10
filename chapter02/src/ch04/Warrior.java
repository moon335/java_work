package ch04;

import java.util.Random;

// 전사 클래스 설계하기
public class Warrior {

	// 상태
	String warriorName;
	int power;
	int hp;
	int mp;

	public Warrior() {
		
	}
	
	public Warrior(String warriorName, int power) {
		this.warriorName = warriorName;
		this.power = power;
		this.hp = 1000;
		this.mp = 500;
	}

	// 기능
	public void attack() {
		System.out.println("적에게 " + this.power + " 데미지를 주었습니다.");
		System.out.println("===================================");
	}

	public void skill(int count) {
		this.mp -= (50 * count);
		if (this.mp <= 0) {
			System.out.println("마나가 부족합니다.");
			System.out.println("===================================");
		} else {
			System.out.println(warriorName + "이(가) 휘두르기를 사용했습니다.");
			System.out.println("적에게 1000 데미지를 주었습니다.");
			System.out.println("남은 mp: " + this.mp);
			System.out.println("===================================");
		}
	}

	public void damaged(int count) {
		this.hp -= (100 * count);
		if (hp <= 0) {
			System.out.println(warriorName + "이(가) 사망했습니다.");
		} else {
			System.out.println("적에게 공격 받았습니다!");
			System.out.println("남은 hp: " + this.hp);
		}
	}

	public void drinkPotion() {
		if (this.hp <= 0) {
			System.out.println("캐릭터가 사망하여 물약을 사용할 수 없습니다.");
			System.out.println("===================================");
		} else if (this.hp >= 1000) {
			System.out.println("더이상 회복할 수 없습니다.");
			System.out.println("===================================");
		} else {
			this.hp += 100;
			this.mp += 50;
			System.out.println("hp와 mp를 회복했습니다.");
			System.out.println("남은 hp: " + this.hp);
			System.out.println("남은 mp: " + this.mp);
			System.out.println("===================================");
		}
	}

	public void warriorInfo() {
		System.out.println("================상태창==================");
		System.out.println("캐릭터명: " + this.warriorName);
		System.out.println("기본 파워: " + this.power);
		System.out.println("hp(health point): " + this.hp + " / 1000");
		System.out.println("mp(mana point): " + this.mp + " / 500");
		System.out.println("========================================");
	}
	
	static int playGame() {
		Random random = new Random();
		
		int resultNumber = random.nextInt(4) + 1;
		return resultNumber;
	}

} // end of class
