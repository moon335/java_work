package lottoMachine;

public abstract class LottoMachine {

	private String name;
	private String shape;
	private int machineNum;

	public LottoMachine(String name, int machineNum) {
		this.name = name;
		this.machineNum = machineNum;
		shape = "둥근 모양의 기계";
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

	public void winningNumber() {
	};

	public void turnOn() {
		System.out.println("로또 기계를 작동합시킵니다.");
	}

	public void turnOff() {
		System.out.println("로또 기계를 종료 시킵니다.");
	}
	
} // end of class
