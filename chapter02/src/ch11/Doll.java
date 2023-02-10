package ch11;

public class Doll extends Goods {

	public Doll() {
		name = "인형";
		color = "pink";
	}
	
	public void dressUp() {
		System.out.println("인형이 옷을 갈아입었습니다.");
	}
	
	public void hairChange() {
		System.out.println("인형의 머리를 바꿨습니다.");
	}
	
}
