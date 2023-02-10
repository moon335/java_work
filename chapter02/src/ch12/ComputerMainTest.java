package ch12;

public class ComputerMainTest {

	// 메인 함수
	public static void main(String[] args) {

		Computer computer1 = new DeskTop();
		Computer computer2 = new MyNoteBook();
		
		computer1.display();
		computer1.typing();
		computer1.turnOn();
		computer1.turnOff();
		System.out.println("------------------------");
		computer2.display();
		computer2.typing();
		computer2.turnOn();
		computer2.turnOff();
		
		
	} // end of main

} // end of class
