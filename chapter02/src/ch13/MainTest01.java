package ch13;

public class MainTest01 {

	// 메인 함수
	public static void main(String[] args) {
		
		Car aiCar = new AiCar();
		aiCar.run();
		System.out.println("===========================");
		ManualCar manualCar = new ManualCar();
		manualCar.run();
		
		
	} // end of main
	
} // end of class
