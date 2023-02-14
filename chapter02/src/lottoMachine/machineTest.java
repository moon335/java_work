package lottoMachine;

public class MachineTest {

	public static void main(String[] args) {
		
		LottoMachine lottoMachine1 = new WinningNumber("뽑기", 1);
		
		
		Human human = new Human("김아무개");
		
		lottoMachine1.run(human);
		
		
	}

}
