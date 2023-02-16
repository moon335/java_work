package ch04;

public class MainTest {
	
	public static void main(String[] args) {
		
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
//		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
		
		// 재료 넣기
		genericPrinter1.setMeterial(new Powder());
		genericPrinter2.setMeterial(new Plastic());
		
		// 문제
		// 제네릭을 활용한 프로그램을 작성하고 테스트 해주세요.
		
		
	} // end of main
} // end of class
