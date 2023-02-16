package ch03;

public class GenericPrinterMainTest {
	
	// 메인 함수
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용 방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		// 재료 넣기
		// 최상위 클래스인 Object를 활용하는 것보다 안정적인 코드를 만들 수 있다.
		// 또한 가독성도 높아진다.
		// genericPrinter.setMeterial(plastic); // 컴파일 시점에 오류가 나타남
		genericPrinter.setMeterial(powder);
		
		// 재료 꺼내기
		// 다운 캐스팅을 할 필요가 없다.
		Powder usePowder = genericPrinter.getMeterial();
//		Plastic usePower = genericPrinter.getMeterial();
		// 잘못된 타입의 데이터를 대입하면 컴파일 시점에 오류를 잡아준다.
		
		// 결론 보다 가독성이 높고 안정적인 프로그래밍을 만들 수 있다.
		// 같은 이름이라면 제네릭 프로그래밍을 설계하면 된다.
		
		

	} // end of main
	
} // end of class
