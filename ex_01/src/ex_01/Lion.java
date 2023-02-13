package ex_01;

public class Lion extends Animal {

	public Lion(String name, double weight, double height) {
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
	
}
