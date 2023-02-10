package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean -- get, set --> is라고 쓰는게 일반적이다. ex) isDie
	
	
	// getter 메서드 직접 만들어 보기.
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public double getDefense() {
		return this.defense;
	}
	
	public boolean isDie() {
		return this.die;
	}
	
	// setter 메서드 직접 만들어 보기.
	// 방어적 코드도 추가해 보세요.
	public void setName(String name) {
		if(name.length() > 8) {
			System.out.println("name은 8자를 넘어갈 수 없습니다.");
			return;
		}
		this.name = name;
	}
	
	public void setHp(int hp) {
		if(hp <= 0) {
			System.out.println("hp는 0이하로 설정할 수 없습니다.");
			return;
		}
		this.hp = hp;
	}
	
	public void setPower(int power) {
		if(power <= 0) {
			System.out.println("power는 0이하로 설정할 수 없습니다.");
		} else {
			this.power = power;
		}
	}
	
	public void setDefense(double defense) {
		if(defense <= 0) {
			System.out.println("defense는 0이하로 설정할 수 없습니다.");
			return;
		}
		this.defense = defense;
	}
	
	public void setDie(boolean die) {
		if(die == true) {
			System.out.println("캐릭터가 사망했습니다.");
			return;
		} 
		this.die = die;
	}
	
	
	
	
} // end of class
