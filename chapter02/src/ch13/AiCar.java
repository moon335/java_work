package ch13;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차 스스로 멈춥니다.");
	}

	@Override
	public void wiper() {
		System.out.println("스스로 빗물 제거");
	}
	
	@Override
	public void washCar() {
		System.out.println("스스로 세차 합니다.");
	}
	
	
} // end of class
