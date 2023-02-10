package ex11;

// 부모 클래스
public class Hero {
	// protected -> 자식 클래스에서 접근 가능한 레벨링이다.
	// 같은 패키지 안에서 접근 가능 하다.
	protected String name;
	protected int hp;
	
	public Hero(String name, int hp) {
		System.out.println("Hero 클래스 생성합니다.");
		this.name = name;
		this.hp = hp;
	}
	
	protected String getName() {
		return name;
	}
	
	protected void attack() {
		System.out.println("공격합니다.");
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100);
		warrior.comboAttack();
		
	}
	
	
} // end of class



