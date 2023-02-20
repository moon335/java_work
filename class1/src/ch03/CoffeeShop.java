package ch03;

public class CoffeeShop {
	private int id;
	private String name;
	private String lacation;
	
	public CoffeeShop(int id, String name, String lacation) {
		this.id = id;
		this.name = name;
		this.lacation = lacation;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getLacation() {
		return lacation;
	}

	

} // end of class
