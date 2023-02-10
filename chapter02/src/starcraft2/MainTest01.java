package starcraft2;

public class MainTest01 {

	// 메인 함수
	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("천하무적질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("귀신잡는해병1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");

		// 질럿이 마린을 공격 - 대상 1, 2
//		zealot1.attackMarine(marine1);
//		System.out.println(marine1.getHp());
		zealot1.attack(marine1);
		zealot1.showInfo();
		zealot1.attack(marine2);
		zealot1.showInfo();
//		zealot1.showInfo();
//		marine1.showInfo();
//		marine2.showInfo();

	} // end of main

} // end of class
