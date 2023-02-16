package ch04;

public class Powder extends Meterial{
	
	@Override
	public String toString() {
		return "재료는 파우더 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더로 출력합니다.");
	}
	
} // end of class