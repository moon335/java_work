package ch02;

public class MainTest01 {

	// 메인 함수
	public static void main(String[] args) {
		
		Powder power = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();
		// 재료 넣기
		threeDPrinter3.setMaterial(plastic);
		// 재료 꺼내보기
		Plastic usePlastic= (Plastic)threeDPrinter3.getMaterial();
		
		// Object <-- 불편한 점들이 존재한다.
		// 다운 캐스팅 처리를 해야하고
		// 런타임 시점에 잘못된 처리를 하게 되면 예외를 발생시킬 수 있다.
		
		
		
	} // end of main

} // end of class
