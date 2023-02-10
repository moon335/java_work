package ch07;

public class Student {

	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		System.out.println(this.name + "은(는) 버스를 탑니다.");
		System.out.println("요금은 " + bus.getPrice() + "원 입니다.");
		this.money -= 1000;
		bus.take();
		showInfo();
	}
	
	public void takeSubway(Subway subway) {
		System.out.println(this.name + "은(는) 지하철을 탑니다.");
		System.out.println("요금은 " + subway.getPrice() + "원 입니다.");
		this.money -= 1200;
		subway.take();
		showInfo();
	}
	
	public void takeTexi(Texi texi) {
		System.out.println(this.name + "은(는) 택시를 탑니다.");
		System.out.println("요금은 " + texi.getPrice() + "원 입니다.");
		this.money -= 10_000;
		texi.take();
		showInfo();
	}
	
	public void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("남은 돈은: " + this.money);
	}
}
