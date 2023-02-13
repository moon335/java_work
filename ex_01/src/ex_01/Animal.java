package ex_01;

public abstract class Animal {
	
	private String name;
	private double weight;
	private double height;
	
	public Animal(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public abstract void run();
	public abstract void eat();
	
	public void fight(Animal animal) {
		System.out.println(name + "이 " + animal.getName() + "과 싸우고 있습니다.");
	}
	
}
