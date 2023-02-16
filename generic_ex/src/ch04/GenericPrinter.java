package ch04;

// T는 Meterial을 상속받은 녀석으로 제한
public class GenericPrinter<T extends Meterial> {
	
	private T meterial;

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return meterial.toString();
	}
	
	
} // end of class
