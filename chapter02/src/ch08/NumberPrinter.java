package ch08;

public class NumberPrinter {
	
	private int id;
	// private static int waitNumber;
	public static int waitNumber; // static 메모리에 미리 생성되기 때문에 객체를 생성하지 않아도 접근 가능
	// public int waitNumber; // 객체를 만들기 전까진 접근하지 못한다. 
	
	// 생성자는 맨 먼저 실행되고, 한번만 수행이 된다.
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}
	
	// 번호표를 출력합니다.
	public void printWaitNumber() {
		System.out.println("대기순번: " + waitNumber);
		waitNumber++;
	}
	
	
	
} // end of class
