package ex_01;

public class Giraffe extends Animal {

	public Giraffe(String name, double weight, double height) {
		super(name, weight, height);
	}

	@Override
	public void run() {
		System.out.println(this.getName() + "이 달리고 있습니다.");
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + "이 먹이를 먹습니다.");
	}
	
} // end of class
