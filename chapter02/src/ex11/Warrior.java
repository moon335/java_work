package ex11;

public class Warrior extends Hero {
	private String warriorName;
	private int warriorHp;

	public Warrior(String name, int hp) {
		// 부모 클래스에 사용자 정의 생성자가 있다면
		// 부모 생성자를 반드시 호출해야 한다.
		// System.out.println("11111111111111"); // 부모 정의 생성자가 있으면 먼저 호출해주어야 한다.
		super(name, hp); // super 키워드는 부모 생성자를 호출하는 녀석이다.
		System.out.println("Warrior 생성자 마지막 줄 코드");
		warriorName = name;
		warriorHp = hp;
	}
	
	public void comboAttack(){
		System.out.println(name + "2단 공격을 합니다.");
	}
	
	public String getName() {
		return warriorName;
	}
	
	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100);
		warrior.comboAttack();
		
		// 메서드 오버로딩은
		// System.out.println이다.
		System.out.println(); // 어떤 데이터 타입을 담을지 미리 설계 되어 있다.
		
	}
	
}