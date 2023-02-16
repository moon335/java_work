package ch05;

public class Book extends Item{
	
	public Book(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
