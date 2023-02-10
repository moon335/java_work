package starcraft3;

public class GateWayMainTest {

	// 메인 함수
	public static void main(String[] args) {
		
		GateWay gateWay1 = new GateWay();
		Zealot[] zealots = gateWay1.createZealot(30);
		System.out.println(zealots[0]);
		System.out.println(zealots[1]);
		System.out.println(zealots[2]);
		
		
	} // end of main
} // end of class
