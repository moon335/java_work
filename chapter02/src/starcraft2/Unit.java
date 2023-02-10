package starcraft2;

public abstract class Unit {

	protected String name;
	protected int power;
	protected int hp;
	protected int maxHp;
	protected int exp;
	protected int maxExp;
	protected int level;
	protected boolean isDie;

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

	public void attack(Unit unit) {
		if (unit.isDie == true) {
			System.out.println("공격 대상이 없습니다!");
		} else {
			System.out.println(this.name + "이 " + unit.getName() + "을 공격 합니다.");
			unit.beAttacked(this.power);
			if (unit.getHp() <= 0) {
				System.out.println("적을 처치했습니다!");
				System.out.println("경험치를 획득합니다 !!");
				exp += 10;
				levelUp(exp);
				unit.isDie = true;
			}
		}
	}

	public void beAttacked(int power) {
		System.out.println(this.name + "이 공격 당합니다.");
		this.hp -= power;
		if (hp <= 0) {
			unitDie(this);
		}
	}

	public void levelUp(int getExp) {
		if (exp >= maxExp) {
			System.out.println("레벨업!!");
			level++;
			exp -= maxExp;
			maxHp = maxHp + (maxHp / 10);
			maxExp = maxExp + (maxExp / 10);
			power = power + (power / 10);
		}
	}

	public void unitDie(Unit unit) {
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망했습니다!");
			unit = null;
		}
	}

	public void showInfo() {
		System.out.println("=======상태창=======");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("현재 레벨: " + this.level);
		System.out.println("생명력: " + this.hp + " / " + this.maxHp);
		System.out.println("현재 경험치: " + this.exp + " / " + this.maxExp);
	}

} // end of class
