package starcraft2;

public class Zealot2 {

	private String name;
	private int power;
	private int hp;
	private int shield;
	private int maxHp;
	private int powerSum;
	private int exp;
	private int maxExp;
	public boolean isDie;

	// 생성자
	public Zealot2(String name) {
		this.name = name;
		this.power = 5;
		maxHp = 80;
		this.shield = maxHp / 10;
		this.hp = 80 + this.shield;
		this.exp = 0;
		this.maxExp = 100;
	}

	// getter 메서드 만들기
	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}

	public int getExp() {
		return this.exp;
	}

	// 질럿이 저글링을 공격한다.
	public void attack(Zergling zergling) {
		if (zergling.isDie == true) {
			System.out.println("공격 대상이 없습니다!");
		} else {
			System.out.println(this.name + "이 " + zergling.getName() + "을 공격 합니다.");
			zergling.beAttacked(this.power);
			if (zergling.getHp() <= 0) {
				System.out.println("적을 처치했습니다!");
				System.out.println("경험치를 획득합니다 !!");
				exp += 10;
				levelUp(exp);
				zergling.isDie = true;
			}
		}
	}

	// 질럿이 마린을 공격합니다. // 12마리
	public void attack(Marine marine) {
		if (marine.isDie == true) {
			System.out.println("공격 대상이 없습니다!");
		} else {
			System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
			// 질럿 공격력은 현재 5
			marine.beAttacked(this.power);
			if (marine.getHp() <= 0) {
				System.out.println("적을 처치했습니다!");
				System.out.println("경험치를 획득합니다 !!");
				exp += 10;
				levelUp(exp);
				marine.isDie = true;
			}
		}
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

	public void unitDie(Zealot2 zealot) {
		if (this.hp <= 0) {
			System.out.println(zealot.name + "이 사망했습니다!");
			zealot = null;
		}
	}

	public void levelUp(int getExp) {
		if (exp >= maxExp) {
			System.out.println("레벨업!!");
			exp -= maxExp;
			maxHp = maxHp + (maxHp / 10);
			maxExp = maxExp + (maxExp / 10);
			power = power + (power / 10);
		}
	}

	public void showInfo() {
		System.out.println("=======상태창=======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("생명력: " + this.hp);
		System.out.println("현재 경험치: " + this.exp + " / " + this.maxExp);
	}

} // end of class
