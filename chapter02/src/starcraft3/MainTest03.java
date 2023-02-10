package starcraft3;

public class MainTest03 {

	// 메인 함수
	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("돌격대장 질럿");
		Marine marine1 = new Marine("귀신잡는해병은아님");
		
		zealot1.attack(marine1);
		marine1.showInfo();
		
	} // end of main

} // end of class
