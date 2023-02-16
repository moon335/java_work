package ex01;

public class Water extends Meterial{
	
	@Override
	public String toString() {
		return "물을 넣습니다.";
	}

	@Override
	public void cook() {
		System.out.println("재료로 물을 넣습니다.");
	}
	
	
} // end of class
