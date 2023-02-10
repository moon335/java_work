package ch06;

public class HeroMainTest01 {

	// 메인 함수
	public static void main(String[] args) {
		Hero hero1 = new Hero();
		
		hero1.setName("사이타마");
		hero1.setHp(500);
		hero1.setPower(1000);
		hero1.setDefense(300.513);
		hero1.setDie(false);
		
		System.out.println("Hero의 이름은:" + hero1.getName() + "입니다.");
		System.out.println("Hero의 hp는:" + hero1.getHp() + "입니다.");
		System.out.println("Hero의 power는:" + hero1.getPower() + "입니다.");
		System.out.println("Hero의 defense는:" + hero1.getDefense() + "입니다.");
		System.out.println("Hero의 사망여부:" + hero1.isDie() + "입니다.");
		
		System.out.println("-------------------------------");
		
		hero1.setHp(-2);
		hero1.setPower(-5);
		hero1.setDefense(-555);
		hero1.setDie(true);
		
		
	} // end of main

} // end of class
