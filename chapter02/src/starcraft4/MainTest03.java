package starcraft4;

public class MainTest03 {

	// 메인 함수
	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("돌격대장 질럿");
		Marine marine1 = new Marine("귀신잡는해병은아님");
		Zergling zergling1 = new Zergling("저글링1");
		
		zealot1.attack(marine1);
		marine1.showInfo();
		System.out.println("-------------------");
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		zealot1.showInfo();
		System.out.println("-------------------");
		zergling1.attack(marine1);
		marine1.showInfo();
		System.out.println("-------------------");
		
		Attack zealot3 = new Zealot("질럿1");
		
	} // end of main

} // end of class
