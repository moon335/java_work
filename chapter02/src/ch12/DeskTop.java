package ch12;

public class DeskTop extends Computer {
	
	@Override
	public void display() {
		System.out.println("화면이 켜졌습니다.");		
	}
	
	@Override
	public void typing() {
		System.out.println("타이핑을 합니다.");		
	}

}
