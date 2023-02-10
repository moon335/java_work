package ch13;

/**
 * 
 * @author GGG
 * 템플릿 메서드 패턴을 구현
 * 핵심 run() 메서드이다.
 */ 
public abstract class Car {
	
	protected abstract void drive();
	public abstract void stop();
	
	private void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public abstract void wiper();
	
	// 후크 메서드
	public void washCar() {
		// 아무것도 구현하지 않음 -> 일반 메서드이다.
		// 필요하다면 자식 클래스에서 구현해서 사용
		// 실행의 흐름에는 넣어둠
	}
	
	// 실행의 흐름을 만들어 둔다.
	// 재정의할 수 없도록 메서드를 설계 --> final
	// 하위 클래스에서 재정의 할 수 없음
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
} // end of class
