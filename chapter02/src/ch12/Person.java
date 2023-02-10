package ch12;

public class Person extends Human {
	
	@Override
	public void hunt() {
		// 만약 hunt가 1000줄이라면 1000줄은 부모 메서드와 똑같이 쓴다는 가정
		// super.();이 없다면 1000줄을 전부 복사해야함
		super.hunt(); // super. 부모클래스의 hunt메서드를 호출
		System.out.println("아는 사람이야!!!");
	}
	
	
}
