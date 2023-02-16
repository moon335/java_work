package ch04;

public class Plastic extends Meterial{
	
	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("plastic 재료로 출력합니다.");
	}
	
	
} // end of class
