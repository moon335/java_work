package ch05;

public class Picture extends Item{
	
	public Picture(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
