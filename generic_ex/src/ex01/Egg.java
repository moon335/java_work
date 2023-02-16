package ex01;

public class Egg extends Meterial{
	
	@Override
	public String toString() {
		return "계란을 넣습니다.";
	}

	@Override
	public void cook() {
		System.out.println("재료로 계란을 넣습니다.");
	}
	
	
	
} // end of class
