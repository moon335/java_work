package ch03;

// 문법 - how
// 이유 - why
// <> <- 다이아몬드 연산자
// 안에는 아무거나 들어가도 되지만 Type의 약자인 T를 많이 쓴다.
public class GenericPrinter<T> {
	
	// T라는 대체 문자를 사용한다. E - element의 약자 K - key, V - value (아무 문자열 다 가능)
	
	// 제네릭 자료형이라고 부른다.
	private T meterial; // T 자료형으로 선언한 변수 - meterial
	
	public T getMeterial() {
		return meterial;
	}
	
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
} // end of class
