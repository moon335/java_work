package ex01;

public class Onion extends Meterial{
	
	@Override
	public String toString() {
		return "양파를 넣습니다.";
	}

	@Override
	public void cook() {
		System.out.println("재료로 양파를 넣습니다.");
	}
	
	
} // end of class
