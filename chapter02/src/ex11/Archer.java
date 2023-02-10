package ex11;

public class Archer extends Hero {

	
	public Archer(String name, int hp) {
		super(name, hp);

	}
	
	void fireArrow() {
		System.out.println(name + "가 불화살 공격을 합니다.");
	}
}
