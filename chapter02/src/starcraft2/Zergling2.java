package starcraft2;

public class Zergling2 {

	private String name;
	private int power;
	private int hp;
	private int maxHp;
	private int exp;
	private int maxExp;
	public boolean isDie;

	public Zergling2(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
		this.maxHp = 50;
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

	// 저글링이 질럿을 공격합니다.
	public void attack(Zealot zealot) {
		if (zealot.isDie == true) {
			System.out.println("공격 대상이 없습니다!");
		} else {
			System.out.println(this.name + "이 " + zealot.getName() + "을 공격 합니다.");
			// 여기서 저글링의 공격력은 3
			zealot.beAttacked(this.power);
			if (zealot.getHp() <= 0) {
				System.out.println("적을 처치했습니다!");
				System.out.println("경험치를 획득합니다 !!");
				exp += 10;
				levelUp(exp);
				zealot.isDie = true;
			}
		}
	}

	// 저글링이 마린을 공격합니다.
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
		if (hp <= 0) {
			unitDie(this);
		}
	}

	public void unitDie(Zergling2 zergling) {
		if (this.hp <= 0) {
			System.out.println("유닛이 사망했습니다!");
			zergling = null;
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
		System.out.println("생명력: " + this.hp + " / " + this.maxHp);
		System.out.println("현재 경험치: " + this.exp + " / " + this.maxExp);
	}

} // end of class
