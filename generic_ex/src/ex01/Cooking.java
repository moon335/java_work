package ex01;

public class Cooking<T extends Meterial> {
	
	private T Meterial;

	public T getMeterial() {
		return Meterial;
	}

	public void setMeterial(T meterial) {
		this.Meterial = meterial;
	}
	
	
	
} // end of class
