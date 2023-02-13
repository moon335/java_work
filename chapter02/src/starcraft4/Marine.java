package starcraft4;

/**
 * @author 김현우
 */

public class Marine extends Unit implements Attack {
	
	private int count;
	
	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
		count = 1;
	}
	
	public void attack(Unit unit) {
		if(count == 1) {
			System.out.println(this.name + "이 " + unit.getName() + "을 공격 합니다.");
			System.out.println("최초 공격에 한하여 공격력이 2배로 적용됩니다!!");
			unit.beAttacked(this.power * 2);
			count++;
		} else {
			System.out.println(this.name + "이 " + unit.getName() + "을 공격 합니다.");
			unit.beAttacked(this.power);
			count++;
		}
	}


} // end of class
