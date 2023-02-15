package lottoMachine;

public abstract class LottoMachine {

	private String name;
	private String shape;
	private int machineNum;
	private int count;
	private int bonus;

	public LottoMachine() {
		
	}
	
	public LottoMachine(String name, int machineNum) {
		this.name = name;
		this.machineNum = machineNum;
		shape = "둥근 모양의 기계";
		count = 0;
		bonus = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getMachineNum() {
		return machineNum;
	}

	public void setMachineNum(int machineNum) {
		this.machineNum = machineNum;
	}

	public abstract void winningNumber();

	public void turnOn() {
		System.out.println("로또 기계를 작동합시킵니다.");
	}

	public void turnOff() {
		System.out.println("로또 기계를 종료 시킵니다.");
	}
	
	// 당첨 조회
	public void result(Human human) {
		for(int i = 0; i < WinningNumber.numberArr.length; i++) {
			for(int j = 0; j < WinningNumber.userNum.length; j++) {
				if(WinningNumber.numberArr[i] == WinningNumber.userNum[j]) {
					count++;
					if(WinningNumber.numberArr[6] == WinningNumber.userNum[j]) {
						bonus++;
					}
				}
			}
		}
		System.out.println(human.getName() + "님이 맞춘 개수는" + count + "개 입니다.");
		if(count <= 2) {
			System.out.println(human.getName() + "님은 아쉽지만 꽝이에요. 다음에 다시 도전하세요");
		} else if(count == 3) {
			System.out.println(human.getName() + "님은 5등 당첨! 축하합니다!");
		} else if(count == 4) {
			System.out.println(human.getName() + "님은 4등 당첨! 축하합니다!");
		} else if(count == 5) {
			System.out.println(human.getName() + "님은 3등 당첨! 축하합니다!");
		} else if(count >= 5 && bonus == 1) {
			System.out.println(human.getName() + "님은 2등 당첨! 축하합니다!");
		} else if(count == 6 && bonus == 0) {
			System.out.println(human.getName() + "님은 1등 당첨!!! 축하합니다!!!");
		}
	}
	
	public abstract void userNumber();
	
	// 템플릿 메서드 패턴 사용
	public final void run(Human human) {
		turnOn();
		userNumber();
		winningNumber();
		result(human);
		turnOff();
	}
	
} // end of class
