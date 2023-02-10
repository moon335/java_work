package ch11;

public class Money extends Goods {
	
	public Money() {
		name = "10000원";
	}
	
	public void buySomeThing() {
		System.out.println("돈으로 물건을 구매합니다.");
	}
}
